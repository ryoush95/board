package com.board.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.VO.BoardVO;

@Repository
public class BoardDAOIm implements BoardDAO {

	@Inject
	private SqlSession sql;

	private static String namespace =  "com.board.mappers.boardMapper";
	
	// 작성
	 @Override
	 public void write(BoardVO vo) throws Exception {
	  sql.insert(namespace + ".write", vo);
	 }
	 // 조회

	 @Override
	 public BoardVO read(int bno) throws Exception {
	  return sql.selectOne(namespace + ".read", bno);
	 }

	 // 수정
	 @Override
	 public void update(BoardVO vo) throws Exception {
	  sql.update(namespace + ".update", vo);
	 }

	 // 삭제
	 @Override
	 public void delete(int bno) throws Exception {
	  sql.delete(namespace + ".delete", bno);
	 }

	 //목록
	 @Override
	 public List<BoardVO> list() throws Exception {
		return sql.selectList(namespace+".list");
	 }
	
	
}
