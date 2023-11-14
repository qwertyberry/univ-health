package univHealth;

import java.util.ArrayList;

public class DailyInfo implements Comparable<DailyInfo> {
	private ArrayList<UserFood> eatenFoods = new ArrayList<>();
	private ArrayList<UserExercise> exercises = new ArrayList<>();
	private Date date;

	public DailyInfo(int year, int month, int day) {
		this.setDate(new Date(year, month, day));
	}

	@Override
	public String toString() {
		String buf = date.toString() + "\n===칼로리정보===\n";
		for (UserFood eatenFood : eatenFoods) {
			buf += eatenFood.toString();
		}

		buf += "===운동정보===\n";
		for (UserExercise exercise : exercises) {
			buf += exercise.toString();
		}

		return buf;
	}

	public ArrayList<UserFood> getEatenFoods() {
		return eatenFoods;
	}

	public void setEatenFoods(ArrayList<UserFood> eatenFoods) {
		this.eatenFoods = eatenFoods;
	}

	public ArrayList<UserExercise> getExercises() {
		return exercises;
	}

	public void setExercises(ArrayList<UserExercise> exercises) {
		this.exercises = exercises;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void addFoodEaten(UserFood eatenFood) {
		eatenFoods.add(eatenFood);
	}

	public void addExerciseDone(UserExercise exercise) {
		exercises.add(exercise);
	}

	@Override
	public int compareTo(DailyInfo other) {
		return this.date.compareTo(other.date);
	}
}