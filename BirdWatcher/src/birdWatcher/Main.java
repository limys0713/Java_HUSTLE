package birdWatcher;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 1
		int[] birdsArray = { 0, 2, 5, 3, 7, 8, 4 };
		BirdWatcher birdsNumber = new BirdWatcher(birdsArray);
		// One-dimensional array uses Arrays.toString to convert to string in order to print out
		System.out.println(Arrays.toString(birdsNumber.getLastWeek()));
		// Task 2
		int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
		BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
		System.out.println(birdCount.getToday());
		// Task 3
		birdCount.incrementTodaysCount();
		System.out.println(birdCount.getToday());
		// Task 4
		birdsPerDay[5] = 1;
		System.out.println(birdCount.hasDayWithoutBirds());
		// Task 5
		System.out.println(birdCount.getCountForFirstDays(4));
		System.out.println(birdCount.getBusyDays());
	}

}
