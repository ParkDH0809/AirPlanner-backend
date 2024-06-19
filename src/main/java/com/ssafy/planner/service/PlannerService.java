package com.ssafy.planner.service;

import java.util.List;

import com.ssafy.planner.dto.Planner;

public interface PlannerService {

    public void insertPlanner(Planner planner) throws Exception;
    
    public List<Planner> getPlanners() throws Exception;
    
    public Planner getPlannerById(int plannerId) throws Exception;

    public List<Planner> getPlannersByUserId(String userId) throws Exception;
    
	public List<Planner> getPlannerRandom() throws Exception;
}
