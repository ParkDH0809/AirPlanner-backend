package com.ssafy.board.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.board.dto.Board;
import com.ssafy.board.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	private BoardMapper mapper;
	
	public BoardServiceImpl(BoardMapper mapper) {
		this.mapper = mapper;
	}
	
	public void insert(Board board) throws SQLException {
		mapper.insert(board);
	}
	
	@Override
	public List<Board> findAll() throws SQLException {
		return mapper.findAll();
	}

	@Override
	public Board select(int boardId) throws SQLException {
		return mapper.select(boardId);
	}

	@Override
	public void delete(int boardId) throws SQLException {
		mapper.delete(boardId);
	}

	@Override
	public void update(Board board) throws SQLException {
		mapper.update(board);
	}

	@Override
	public List<Board> findByCategory(String boardCategory) throws SQLException {
		return mapper.findByCategory(boardCategory);
	}

}
