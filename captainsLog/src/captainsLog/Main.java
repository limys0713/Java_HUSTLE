package captainsLog;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		CaptainsLog object = new CaptainsLog(random);
		// Task 1
		System.out.println(object.randomPlanetClass());
		// Task 2
		System.out.println(object.randomShipRegistryNumber());
		// Task 3
		System.out.println(object.randomStardate());
	}

}
