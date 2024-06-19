package com.ssafy.user.controller;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.user.dto.User;
import com.ssafy.user.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 신규 회원 정보를 저장한다.
	 * 
	 * @param user
	 * @return index page
	 */
	@PostMapping("/signup")
	public ResponseEntity<?> signup(@RequestBody User user) throws SQLException {
		userService.signup(user);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}

	/**
	 * 로그인 버튼 클릭 시 아이디, 비밀번호를 기반으로 검증한다. 인증이 되면 정보를 세션에 저장한다.
	 * 
	 * @param id
	 * @param password
	 * @param request
	 * @return index page
	 */
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user, HttpServletRequest request) throws SQLException {
		if (userService.login(user.getUserId(), user.getUserPassword())) {
			User loginUser = userService.select(user.getUserId());
			return ResponseEntity.status(HttpStatus.OK).body(loginUser);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error: login failure");
		}
	}

	@PatchMapping("/update")
	public ResponseEntity<?> update(@RequestBody User user) throws SQLException {
		userService.update(user);
		return ResponseEntity.status(HttpStatus.OK).body("update success");
	}

}