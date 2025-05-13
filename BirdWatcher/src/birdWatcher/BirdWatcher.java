package birdWatcher;

public class BirdWatcher {
	private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        // Pass by reference
        // To prevent accessed from the outside, use clone()
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        // Find the last element
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int index = birdsPerDay.length - 1;
        birdsPerDay[index]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int birdsNumber : birdsPerDay){
            if(birdsNumber == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if(numberOfDays > 7){
            numberOfDays = 7;
        }
        for(int i = 0; i < numberOfDays; i++){
            count = count + birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for(int birdsNumber : birdsPerDay){
            if(birdsNumber >= 5){
                count++;
            }
        }
        return count;
    }
}
