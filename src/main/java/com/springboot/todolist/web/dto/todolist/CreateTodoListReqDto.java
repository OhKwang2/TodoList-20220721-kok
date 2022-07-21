package com.springboot.todolist.web.dto.todolist;

import com.springboot.todolist.domain.todolist.TodoList;

import lombok.Data;

@Data
public class CreateTodoListReqDto {
	private String content;
	private int usercode;
	
	public TodoList toEntity() {
		return TodoList.builder()
				.content(content)
				.usercode(usercode)
				.build();
	}
}
