package com.springboot.todolist.web.dto.todolist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateUserRespDto {
	private int usercode;
	private String username;
	private String password;
	private String name;
	private String email;
	private boolean insertStatus;
}
