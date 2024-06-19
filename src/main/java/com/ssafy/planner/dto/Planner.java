package com.ssafy.planner.dto;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class Planner {

	private int plannerId;
	private String userId;
	private Date plannerSDate;
	private Date plannerEDate;
	private String plannerTitle;
	private boolean plannerVisible;
	private List<Plan> plannerPlans;
	
}
