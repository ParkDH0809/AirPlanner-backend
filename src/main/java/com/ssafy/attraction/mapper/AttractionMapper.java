package com.ssafy.attraction.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.attraction.dto.Attraction;
import com.ssafy.attraction.dto.AttractionSearchRequestDto;
import com.ssafy.attraction.dto.AttractionSearchResponseDto;

@Mapper
public interface AttractionMapper {

	List<AttractionSearchResponseDto> searchByConditions(AttractionSearchRequestDto attractionSearchRequest)
			throws Exception;

	Attraction selectAttractionByContentId(int contentId) throws Exception;

	List<Attraction> getHotLocal() throws Exception;

	List<Attraction> getMaxScoreAvgRankFive() throws Exception;
}
