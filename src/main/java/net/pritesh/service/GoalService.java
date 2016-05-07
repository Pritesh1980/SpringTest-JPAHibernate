package net.pritesh.service;

import java.util.List;

import net.pritesh.model.Goal;
import net.pritesh.model.GoalReport;

public interface GoalService
{
	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();
}
