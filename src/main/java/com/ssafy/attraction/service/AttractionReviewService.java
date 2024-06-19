package com.ssafy.attraction.service;

import java.util.List;

import com.ssafy.attraction.dto.AttractionReview;

public interface AttractionReviewService {
	
	void insertReview(AttractionReview attractionReview) throws Exception;

	void updateReview(AttractionReview attractionReview) throws Exception;

	void deleteReview(int reviewId) throws Exception;

	List<AttractionReview> getReviews() throws Exception;

	List<AttractionReview> getReviewByContentId(int contentId) throws Exception;

	List<AttractionReview> getReviewByUserId(String userId) throws Exception;

}
