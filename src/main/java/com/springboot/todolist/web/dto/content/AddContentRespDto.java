package com.springboot.todolist.web.dto.content;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddContentRespDto {
	private int contentcode;
	private int usercode;
	private String content;
	private boolean insertStatus;
}
