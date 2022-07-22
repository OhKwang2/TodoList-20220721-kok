package com.springboot.todolist.web.controller.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.service.content.ContentService;
import com.springboot.todolist.web.dto.CMRespDto;
import com.springboot.todolist.web.dto.content.AddContentReqDto;
import com.springboot.todolist.web.dto.content.AddContentRespDto;
import com.springboot.todolist.web.dto.content.ReadContentRespDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/todolist")
@RequiredArgsConstructor
public class ContentController {

	private final ContentService contentService;
	
	//content 작성
	@PostMapping("/content")
	public ResponseEntity<?> addContent (@RequestBody AddContentReqDto addContentReqDto) {
		AddContentRespDto addContentRespDto = null;
		try {
			addContentRespDto = contentService.addContent(addContentReqDto);			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(new CMRespDto<>(1, "content 등록 실패", addContentRespDto));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1, "content 등록 성공", addContentRespDto));
	}
	
	//content 조회
	@GetMapping("/list/{contentcode}")
	public ResponseEntity<?> getContent(@PathVariable int contentcode){
		ReadContentRespDto readContentDto = null;
		try {
			readContentDto = contentService.readContent(contentcode);			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1, "content 조회 실패", readContentDto));
		}
		
		return ResponseEntity.ok(new CMRespDto<>(1, "content 조회 성공", readContentDto));
	}
	
	//content 리스트 조회
	@GetMapping("/list")
	public ResponseEntity<?> getContentList(@RequestParam int page) {
		List<ReadContentRespDto> contentDtoList = null;
		try {
			contentDtoList = contentService.readContentList(page);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1, "리스트 조회 실패", contentDtoList));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1, "리스트 조회 성공", contentDtoList));
	}
	
	//content 수정
	
	//content 삭제
	
}
