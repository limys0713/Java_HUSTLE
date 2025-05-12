package carAssemble;

public class CarAssemble {
	public double productionRatePerHour(int speed) {
		double answer;
		if (speed >= 1 && speed <= 4) {
			answer = speed * 221;
		}else if(speed >= 5 && speed <= 8) {
			answer = speed * 221 * 0.9;
		}else if(speed == 9) {
			answer = speed * 221 * 0.8;
		}else {
			answer = speed * 221 * 0.77;
		}
		return answer;
	}
	
	public int workingItemsPerMinute(int speed) {
		// Non-static function: invoking using object
		CarAssemble answer = new CarAssemble();
		// Cast to int
		return (int)(answer.productionRatePerHour(speed) / 60);
	}
}
