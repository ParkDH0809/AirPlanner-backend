package com.ssafy.board.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Board {
	
	private int boardId;
	private String boardTitle;
	private String boardContent;
	private Date boardCreateAt;
	private Date boardModifyAt;
	private String boardCategory;
	private String boardAdminId;
	
	@Builder
	public Board(String boardTitle, String boardContent, Date boardCreateAt, Date boardModifyAt,
			String boardCategory, String boardAdminId) {
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardCategory = boardCategory;
		this.boardAdminId = boardAdminId;
	}
	
}
