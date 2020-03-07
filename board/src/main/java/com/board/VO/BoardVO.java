package com.board.VO;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	/*
	 * bno number not null, 
	 * title varchar2(30) not null, 
	 * content varchar2(200) notnull, 
	 * writer varchar2(30) not null, 
	 * regDate date default sysdate, 
	 * viewCnt number default 0,
	 */
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int viewCnt;
}
