package net.pritesh.model;

public class GoalReport
{
	private int		goalMinutes;
	private int		exerciseMinutes;
	private String	exerciseActivity;

	public GoalReport(int goalMinutes, int exerciseMinutes,
			String exerciseActivity)
	{
		this.goalMinutes = goalMinutes;
		this.exerciseActivity = exerciseActivity;
		this.exerciseActivity = exerciseActivity;
	}

	public final String getExerciseActivity()
	{
		return exerciseActivity;
	}

	public final int getExerciseMinutes()
	{
		return exerciseMinutes;
	}

	public final int getGoalMinutes()
	{
		return goalMinutes;
	}

	public final void setExerciseActivity(String exerciseActivity)
	{
		this.exerciseActivity = exerciseActivity;
	}

	public final void setExerciseMinutes(int exerciseMinutes)
	{
		this.exerciseMinutes = exerciseMinutes;
	}

	public final void setGoalMinutes(int goalMinutes)
	{
		this.goalMinutes = goalMinutes;
	}
}
