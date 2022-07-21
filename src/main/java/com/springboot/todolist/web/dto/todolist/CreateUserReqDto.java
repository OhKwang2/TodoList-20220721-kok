package com.springboot.todolist.web.dto.todolist;

import com.springboot.todolist.domain.todolist.TodoList;

import lombok.Data;

@Data
public class CreateUserReqDto {
	private String username;
	private String password;
	private String name;
	private String email;
	
	public TodoList toEntity() {
		return TodoList.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
	}
	
}
