package com.ssafy.attraction.service;

import java.util.List;
import java.util.Map;

import com.ssafy.attraction.dto.Attraction;
import com.ssafy.attraction.dto.AttractionSearchRequestDto;
import com.ssafy.attraction.dto.AttractionSearchResponseDto;

public interface AttractionService {

	List<AttractionSearchResponseDto> searchByConditions(AttractionSearchRequestDto attractionSearchRequest)
			throws Exception;

	Attraction selectAttractionByContentId(int contentId) throws Exception;

	Map<Integer, List<Attraction>> getHotLocal() throws Exception;
}
