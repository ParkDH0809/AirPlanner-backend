package com.ssafy.planner.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.planner.dto.Planner;
import com.ssafy.planner.service.PlannerService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/planner")
@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
public class PlannerController {

	private final PlannerService plannerService;

	/**
	 * 플래너 작성
	 * 
	 * @param planner
	 * @return
	 * @throws Exception
	 */
	@PostMapping("")
	public ResponseEntity<?> insertPlanner(@RequestBody Planner planner) throws Exception {
		plannerService.insertPlanner(planner);
		return ResponseEntity.status(HttpStatus.OK).body(planner);
	}
	
	/**
	 * 전체 플래너 조회
	 * 
	 * @param plannerId
	 * @return
	 * @throws Exception
	 */
	@GetMapping("")
	public ResponseEntity<?> getPlanners() throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(plannerService.getPlanners());
	}

	/**
	 * plannerId에 맞는 플래너 조회
	 * 
	 * @param plannerId
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/{plannerId}")
	public ResponseEntity<?> select(@PathVariable("plannerId") int plannerId) throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(plannerService.getPlannerById(plannerId));
	}

	/**
	 * 유저 별 플래너 조회
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/planners/{userId}")
	public ResponseEntity<?> getPlannersByUserId(@PathVariable("userId") String userId) throws Exception {
		List<Planner> planners = plannerService.getPlannersByUserId(userId);
		return ResponseEntity.status(HttpStatus.OK).body(planners);
	}

	/**
	 * 랜덤 플래너 조회
	 * 
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/random")
	public ResponseEntity<?> getPlannerRandom() throws Exception {
		List<Planner> planners = plannerService.getPlannerRandom();
		return ResponseEntity.status(HttpStatus.OK).body(planners);
	}
}
