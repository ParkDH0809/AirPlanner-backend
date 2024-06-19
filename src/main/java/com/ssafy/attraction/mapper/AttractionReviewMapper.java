package com.ssafy.attraction.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.attraction.dto.AttractionReview;

@Mapper
public interface AttractionReviewMapper {
	
	void insertReview(AttractionReview attractionReview) throws Exception;

	void updateReview(AttractionReview attractionReview) throws Exception;

	void deleteReview(int reviewId) throws Exception;

	List<AttractionReview> getReviews() throws Exception;

	List<AttractionReview> getReviewByContentId(int contentId) throws Exception;

	List<AttractionReview> getReviewByUserId(String userId) throws Exception;

}
