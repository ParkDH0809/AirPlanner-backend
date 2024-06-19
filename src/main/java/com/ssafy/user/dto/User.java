package com.ssafy.user.dto;

import java.util.Date;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
	
	private String userId;
    private String userPassword;
    private String userName;
    private String userNickName;
    private String userEmail;
    private Date userCreatedAt;
    private String userTel;
    private int userRole;
    
    @Builder
	public User(String userId, String userPassword, String userName, String userNickName, String userEmail, String userTel) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userNickName = userNickName;
		this.userEmail = userEmail;
		this.userTel = userTel;	
	}
    
}