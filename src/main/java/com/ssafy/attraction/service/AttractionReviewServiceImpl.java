package com.ssafy.attraction.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.attraction.dto.AttractionReview;
import com.ssafy.attraction.mapper.AttractionReviewMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AttractionReviewServiceImpl implements AttractionReviewService {
	private final AttractionReviewMapper attractionReviewMapper;

	@Override
	public void insertReview(AttractionReview attractionReview) throws Exception {
		attractionReviewMapper.insertReview(attractionReview);
	}

	@Override
	public void updateReview(AttractionReview attractionReview) throws Exception {
		attractionReviewMapper.updateReview(attractionReview);
	}

	@Override
	public void deleteReview(int reviewId) throws Exception {
		attractionReviewMapper.deleteReview(reviewId);
	}

	@Override
	public List<AttractionReview> getReviews() throws Exception {
		return attractionReviewMapper.getReviews();
	}

	@Override
	public List<AttractionReview> getReviewByContentId(int contentId) throws Exception {
		return attractionReviewMapper.getReviewByContentId(contentId);
	}

	@Override
	public List<AttractionReview> getReviewByUserId(String userId) throws Exception {
		return attractionReviewMapper.getReviewByUserId(userId);
	}
}
