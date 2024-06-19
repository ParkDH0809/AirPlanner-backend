package com.ssafy.attraction.dto;

import java.util.Date;

import lombok.Data;

@Data
public class AttractionReview {
	
	private int reviewId;
	private int contentId;
	private String reviewText;
	private Date reviewCreateAt;
	private Date reviewModifyAt;
	private String userId;
	private int attractionScore;
	
}
