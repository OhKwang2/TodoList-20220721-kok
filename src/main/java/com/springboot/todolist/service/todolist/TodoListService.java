package com.springboot.todolist.service.todolist;

public interface TodoListService {
	public CreateTodoListRespDto createTodoList(CreateTodoListRespDto createTodoListReqDto) throws Exception;
	public CreateUserRespDto createUser(CreateUserRespDto creatUserReqDto) throws Exception;
	public ReadTodoListRespDto readTodoList(int contentcode) throws Exception;
	public List<ReadTodoListRespDto> readTodoList(int page) throws Exception;
	public boolean udatateTodoList(int contentcode, CreateTodoListRespDto createTodoListReqDto) throws Exception;
	public boolean deleteContent(int contentcode) throws Exception;
	
}
