package com.springboot.todolist.service.content;

import java.util.List;

import com.springboot.todolist.web.dto.content.AddContentReqDto;
import com.springboot.todolist.web.dto.content.AddContentRespDto;
import com.springboot.todolist.web.dto.content.ReadContentRespDto;

public interface ContentService {
	public AddContentRespDto addContent(AddContentReqDto addContentReqDto) throws Exception;
	public ReadContentRespDto readContent(int contentcode) throws Exception;
	public List<ReadContentRespDto> readContentList(int page) throws Exception;
	public boolean udatateContent(int contentcode, AddContentRespDto createTodoListReqDto) throws Exception;
	public boolean deleteContent(int contentcode) throws Exception;
	
}
