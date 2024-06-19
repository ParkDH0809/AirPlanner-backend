package com.ssafy.board.controller;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.dto.Board;
import com.ssafy.board.service.BoardService;

@RestController
@RequestMapping("/service")
@CrossOrigin("*")
public class BoardController {
	
	private BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@GetMapping("")
	public ResponseEntity<?> findAll() throws SQLException {
		return ResponseEntity.status(HttpStatus.OK).body(boardService.findAll());
	}
	
	@PostMapping("")
	public ResponseEntity<?> insert(@RequestBody Board board) throws SQLException {
		boardService.insert(board);
		return ResponseEntity.status(HttpStatus.OK).body("insert success");
	}
	
	@GetMapping("/{boardId}")
	public ResponseEntity<?> select(@PathVariable("boardId") int boardId) throws SQLException {
		return ResponseEntity.status(HttpStatus.OK).body(boardService.select(boardId));
	}
	
	@DeleteMapping("/{boardId}")
	public ResponseEntity<?> delete(@PathVariable("boardId") int boardId) throws SQLException {
		boardService.delete(boardId);
		return ResponseEntity.status(HttpStatus.OK).body("delete success");
	}
	
	@PatchMapping("/{boardId}")
	public ResponseEntity<?> update(@PathVariable("boardId") int boardId, @RequestBody Board board) throws SQLException {
		boardService.update(board);
		return ResponseEntity.status(HttpStatus.OK).body("update success");
	}
}
