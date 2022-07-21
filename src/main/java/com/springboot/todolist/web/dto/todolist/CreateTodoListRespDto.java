package com.springboot.todolist.web.dto.todolist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateTodoListRespDto {
	private int contentcode;
	private String content;
	private int usercode;
	private boolean insertStatus;
}
