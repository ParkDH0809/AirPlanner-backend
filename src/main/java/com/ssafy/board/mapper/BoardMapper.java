package com.ssafy.board.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.board.dto.Board;

@Mapper
public interface BoardMapper {
	
	/**
	 * Board 생성
	 * @throws SQLException
	 */
	void insert(Board board) throws SQLException;

	/**
	 * 모든 Board 조회
	 * @return List<Board>
	 * @throws SQLException
	 */
	List<Board> findAll() throws SQLException;
	
	/**
	 * boardId가 알맞는 board 조회
	 * @param boardId
	 * @return
	 * @throws SQLException
	 */
	Board select(int boardId) throws SQLException;
	
	/**
	 * boardId가 알맞는 board 삭제
	 * @param boardId
	 * @throws SQLException
	 */
	void delete(int boardId) throws SQLException;
	
	/**
	 * boardId가 알맞는 board 수정
	 * @param board
	 * @throws SQLException
	 */
	void update(Board board) throws SQLException;
	
	/**
	 * category가 일치하는 board 조회
	 * @param boardCategory
	 * @return
	 * @throws SQLException
	 */
	List<Board> findByCategory(String boardCategory) throws SQLException;
}
