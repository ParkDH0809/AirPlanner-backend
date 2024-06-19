package com.ssafy.attraction.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.attraction.dto.Attraction;
import com.ssafy.attraction.dto.AttractionReview;
import com.ssafy.attraction.dto.AttractionSearchRequestDto;
import com.ssafy.attraction.dto.AttractionSearchResponseDto;
import com.ssafy.attraction.service.AttractionReviewService;
import com.ssafy.attraction.service.AttractionService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/attraction")
@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
public class AttractionController {
	private final AttractionService attractionService;
	private final AttractionReviewService attractionReviewService;

	/**
	 * 관광지 검색 (시 코드, 타입 코드, 제목 명으로 검색)
	 * 
	 * @param attractionSearchRequestDto
	 * @return
	 * @throws Exception
	 */
	@PostMapping
	public ResponseEntity<?> searchAttraction(@RequestBody AttractionSearchRequestDto attractionSearchRequestDto)
			throws Exception {
		List<AttractionSearchResponseDto> list = null;
		list = attractionService.searchByConditions(attractionSearchRequestDto);
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}

	/**
	 * contentId에 맞는 관광지 조회
	 * 
	 * @param contentId
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/{contentId}")
	public ResponseEntity<?> selectAttractionByContentId(@PathVariable int contentId) throws Exception {
		Attraction attractionSearchResponseDto = attractionService.selectAttractionByContentId(contentId);
		return ResponseEntity.status(HttpStatus.OK).body(attractionSearchResponseDto);
	}

	/**
	 * hotLocal 정보 조회
	 * 
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/hotLocal")
	public ResponseEntity<?> getHotLocal() throws Exception {
		Map<Integer, List<Attraction>> hotLocal = null;
		hotLocal = attractionService.getHotLocal();
		return ResponseEntity.status(HttpStatus.OK).body(hotLocal);
	}

	/**
	 * 리뷰 작성
	 * 
	 * @param attractionReview
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/reviews")
	public ResponseEntity<?> insertReview(@RequestBody AttractionReview attractionReview) throws Exception {
		attractionReviewService.insertReview(attractionReview);
		return ResponseEntity.status(HttpStatus.OK).body(attractionReview);
	}

	/**
	 * 리뷰 수정
	 * 
	 * @param attractionReview
	 * @return
	 * @throws Exception
	 */
	@PatchMapping("/reviews")
	public ResponseEntity<?> updateReview(@RequestBody AttractionReview attractionReview) throws Exception {
		attractionReviewService.updateReview(attractionReview);
		return ResponseEntity.status(HttpStatus.OK).body(attractionReview);

	}

	/**
	 * 리뷰 삭제
	 * 
	 * @param reviewId
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping("/reviews/{reviewId}")
	public ResponseEntity<?> deleteReview(@PathVariable int reviewId) throws Exception {
		attractionReviewService.deleteReview(reviewId);
		return ResponseEntity.status(HttpStatus.OK).body(true);
	}

	/**
	 * 전체 리뷰 조회
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/reviews")
	public ResponseEntity<?> getReviews() throws Exception {
		List<AttractionReview> reviews = null;
		reviews = attractionReviewService.getReviews();
		return ResponseEntity.status(HttpStatus.OK).body(reviews);
	}

	/**
	 * 관광지 별 리뷰 조회
	 * 
	 * @param contentId
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/reviews/{contentId}")
	public ResponseEntity<?> getReviewByContentId(@PathVariable int contentId) throws Exception {
		List<AttractionReview> reviews = null;
		reviews = attractionReviewService.getReviewByContentId(contentId);
		return ResponseEntity.status(HttpStatus.OK).body(reviews);
	}

	/**
	 * 사용자 별 리뷰 조회
	 * 
	 * @param contentId
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/myReview/{userId}")
	public ResponseEntity<?> getReviewByUserId(@PathVariable String userId) throws Exception {
		List<AttractionReview> reviews = attractionReviewService.getReviewByUserId(userId);
		return ResponseEntity.status(HttpStatus.OK).body(reviews);
	}

}
