package cookYourLasagna;

public class Lasagna {
	public int expectedMinutesInOven(){
		return 40;
	}
	
	public int remainingMinutesInOven(int minutes) {
		return expectedMinutesInOven() - minutes;
	}
	
	public int preparationTimeInMinutes(int noLayers) {
		return 2 * noLayers;
	}
	
	public int totalTimeInMinutes(int noLayers, int minutes) {
		return preparationTimeInMinutes(noLayers) + minutes;
	}
}
