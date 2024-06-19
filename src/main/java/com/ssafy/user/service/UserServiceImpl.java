package com.ssafy.user.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.ssafy.user.dto.User;
import com.ssafy.user.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	private UserMapper mapper;

	public UserServiceImpl(UserMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public boolean login(String userId, String userPassword) throws SQLException {
		return mapper.login(userId, userPassword);
	}

	@Override
	public User select(String userId) throws SQLException {
		return mapper.select(userId);
	}

	@Override
	public void signup(User user) throws SQLException {
		mapper.signup(user);
	}

	@Override
	public void delete(String userId) throws SQLException {
		mapper.delete(userId);
	}

	@Override
	public void update(User user) throws SQLException {
		mapper.update(user);
	}

}
