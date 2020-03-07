package com.board.service;

import com.board.VO.BoardVO;


public interface BoardService {

	// 작성
	public void write(BoardVO vo) throws Exception;

	// 조회
	public BoardVO read(int bno) throws Exception;

	// 수정
	public void update(BoardVO vo) throws Exception;

	// 삭제
	public void delete(int bno) throws Exception;
}
