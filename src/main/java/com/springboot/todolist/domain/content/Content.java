package com.springboot.todolist.domain.content;

import java.time.LocalDateTime;

import com.springboot.todolist.web.dto.content.AddContentRespDto;
import com.springboot.todolist.web.dto.content.ReadContentRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Content {
	private int usercode;
	private int contentcode;
	private String username;
	private String content;
	private String password;
	private String name;
	private String email;
	private LocalDateTime createdate;
	private LocalDateTime updatedate;
	
	public AddContentRespDto toAddContentDto(boolean insertStatus) {
		return AddContentRespDto.builder()
				.contentcode(contentcode)
				.usercode(usercode)
				.content(content)
				.insertStatus(insertStatus)
				.build();
	}
	
	public ReadContentRespDto toReadContentDto () {
		return ReadContentRespDto.builder()
				.contentcode(contentcode)
				.usercode(usercode)
				.createDate(createdate)
				.build();
	}

}
