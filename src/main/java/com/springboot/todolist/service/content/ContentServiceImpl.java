package com.springboot.todolist.service.content;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.todolist.domain.content.Content;
import com.springboot.todolist.domain.content.ContentRepository;
import com.springboot.todolist.web.dto.content.AddContentReqDto;
import com.springboot.todolist.web.dto.content.AddContentRespDto;
import com.springboot.todolist.web.dto.content.ReadContentRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContentServiceImpl implements ContentService{
	
	private final ContentRepository contentRepository;
	
	@Override
	public AddContentRespDto addContent(AddContentReqDto addContentReqDto) throws Exception {
		
		Content contentEntity = addContentReqDto.toEntity();
		boolean insertStatus = contentRepository.save(contentEntity) >0;
		
		return contentEntity.toAddContentDto(insertStatus);
	}

	@Override
	public ReadContentRespDto readContent(int contentcode) throws Exception {
		return contentRepository.findContentByContentcode(contentcode).toReadContentDto();
	}

	@Override
	public List<ReadContentRespDto> readContentList(int page) throws Exception {
		List<ReadContentRespDto> ContentDtoList = new ArrayList<ReadContentRespDto>();
		contentRepository.getContentListOfIndex((page -1) * 10).forEach(content -> {
			ContentDtoList.add(content.toReadContentDto());
		});
		
		return ContentDtoList;
	}

	@Override
	public boolean udatateContent(int contentcode, AddContentRespDto createTodoListReqDto) throws Exception {
		return false;
	}

	@Override
	public boolean deleteContent(int contentcode) throws Exception {
		return false;
	}

}
