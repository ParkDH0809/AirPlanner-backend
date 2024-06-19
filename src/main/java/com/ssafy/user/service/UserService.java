package com.ssafy.user.service;

import java.sql.SQLException;

import com.ssafy.user.dto.User;

public interface UserService {

	/**
	 * login
	 * 
	 * @param userId
	 * @param userPassword
	 * @return 성공 시 true / 실패 시 flase
	 * @throws SQLException
	 */

	boolean login(String userId, String userPassword) throws SQLException;

	/**
	 * id에 해당하는 사용자 정보를 반환한다.
	 *
	 * @param id 조회할 사용자의 id
	 * @return 조회된 사용자 정보 객체 User
	 * @throws SQLException
	 */
	User select(String userId) throws SQLException;

	/**
	 * 회원가입
	 * 
	 * @param user 가입할 회원정보
	 * @return
	 * @throws SQLException
	 */
	void signup(User user) throws SQLException;

	/**
	 * 회원 탈퇴
	 * 
	 * @param userId 삭제할 사용자의 id
	 * @throws SQLException
	 */
	void delete(String userId) throws SQLException;

	/**
	 * 회원정보 수정
	 * 
	 * @param user 수정할 회원정보
	 * @throws SQLException
	 */

	void update(User user) throws SQLException;

}