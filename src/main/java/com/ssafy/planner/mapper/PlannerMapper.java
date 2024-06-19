package com.ssafy.planner.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.planner.dto.Plan;
import com.ssafy.planner.dto.Planner;

@Mapper
public interface PlannerMapper {
	
	public int insertPlanner(Planner planner) throws Exception;
	
	public void insertPlan(Plan plan) throws Exception; 
	
	public List<Planner> getPlanners() throws Exception;
	
	public Planner getPlannerByPlannerId(int plannerId) throws Exception;
	
	public List<Planner> getPlannersByUserId(String userId) throws Exception;
	
	public List<Plan> getPlansByPlannerId(int plannerId) throws Exception;
	
	public List<Planner> getPlannerRandom() throws Exception;

}
