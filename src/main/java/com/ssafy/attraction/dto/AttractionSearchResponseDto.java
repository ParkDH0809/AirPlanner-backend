package com.ssafy.attraction.dto;

import lombok.Data;

@Data
public class AttractionSearchResponseDto {
	
	private int contentId;
	private int contentTypeId;
	private String title;
	private String addr1;
	private String addr2;
	private String tel;
	private String firstImage;
	private String firstImage2;
	private int readCount;
	private double latitude;
	private double longitude;
	private double scoreAvg;
	
}