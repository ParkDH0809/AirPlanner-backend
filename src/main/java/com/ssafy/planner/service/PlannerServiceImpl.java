package com.ssafy.planner.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.planner.dto.Plan;
import com.ssafy.planner.dto.Planner;
import com.ssafy.planner.mapper.PlannerMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PlannerServiceImpl implements PlannerService {
	
	private final PlannerMapper plannerMapper;

	@Override
	public void insertPlanner(Planner planner) throws Exception {
		plannerMapper.insertPlanner(planner);
		int plannerId = planner.getPlannerId();
		for(Plan plan: planner.getPlannerPlans()) {
			plan.setPlannerId(plannerId);
			plannerMapper.insertPlan(plan);
		}
	}
	
	@Override
	public List<Planner> getPlanners() throws Exception {
		List<Planner> planners = plannerMapper.getPlanners();
		for(Planner planner : planners) {
			List<Plan> plans = plannerMapper.getPlansByPlannerId(planner.getPlannerId());
			planner.setPlannerPlans(plans);
		}
		return planners;
	}
	
	@Override
	public Planner getPlannerById(int plannerId) throws Exception {
		List<Plan> plans = plannerMapper.getPlansByPlannerId(plannerId);
		Planner planner = plannerMapper.getPlannerByPlannerId(plannerId);
		planner.setPlannerPlans(plans);
		return planner;
	}
	
	@Override
	public List<Planner> getPlannersByUserId(String userId) throws Exception {
		List<Planner> planners = plannerMapper.getPlannersByUserId(userId);
		for(Planner planner : planners) {
			List<Plan> plans = plannerMapper.getPlansByPlannerId(planner.getPlannerId());
			planner.setPlannerPlans(plans);
		}
		return planners;
	}

	@Override
	public List<Planner> getPlannerRandom() throws Exception {
		List<Planner> planners = plannerMapper.getPlannerRandom();
		for(Planner planner : planners) {
			List<Plan> plans = plannerMapper.getPlansByPlannerId(planner.getPlannerId());
			planner.setPlannerPlans(plans);
		}
		return planners;
	}
}
