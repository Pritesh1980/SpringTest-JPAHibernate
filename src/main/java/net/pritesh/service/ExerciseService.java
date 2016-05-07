package net.pritesh.service;

import java.util.List;

import net.pritesh.model.Activity;
import net.pritesh.model.Exercise;

public interface ExerciseService
{

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}