package com.springboot.todolist.domain.todolist;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoList {
	private int usercode;
	private int contentcode;
	private String username;
	private String content;
	private String password;
	private String name;
	private String email;
	private LocalDateTime createdate;
	private LocalDateTime updatedate;
	
	}

}
