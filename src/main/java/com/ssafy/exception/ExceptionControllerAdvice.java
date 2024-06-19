package com.ssafy.exception;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex) {
		log.error("Exception 발생 : {}", ex.getMessage());
		return "error/error";
	}
	
	@ExceptionHandler(SQLException.class)
	public String handleSQLException(Exception ex) {
		log.error("SQLException 발생 : {}", ex.getMessage());
		return "error/error";
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public String handle404(NoHandlerFoundException ex) {
		log.error("404 발생 : {}", "404 page not found");
		return "error/error";
	}

}
