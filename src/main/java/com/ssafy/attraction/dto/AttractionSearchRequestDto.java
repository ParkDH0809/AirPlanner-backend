package com.ssafy.attraction.dto;

import lombok.Data;

@Data
public class AttractionSearchRequestDto {
	
	private int sidoCode;
	private int contentTypeId;
	private String searchKeyword;
	
}
