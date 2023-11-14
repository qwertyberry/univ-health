package univHealth;

public class UserExercise {
	Exercise exercise;
	int weights; // 가중치(얼마나 오랬동안 했는지, 얼마나 많이 했는지)
	int caloriesBurned;	//칼로리 소모량 (칼로리) = METs × 체중(kg) × 시간(시간) -> 아님 조정 필요

	public UserExercise(Exercise exercise, int weights) {
		this.exercise = exercise;
		this.weights = weights;
		this.caloriesBurned = exercise.caloriesBurnedPerMinute * weights;
	}

}
