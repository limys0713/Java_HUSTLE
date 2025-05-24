package needForSpeed;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed = 5;
		int batteryDrain = 2;
		// Task 1
		var car = new NeedForSpeed(speed, batteryDrain);
		// Task 2
		int distance = 800;
		var raceTrack = new RaceTrack(distance);
		// Task 3
		car.drive();
		System.out.println(car.distanceDriven());
		// Task 4
		System.out.println(car.batteryDrained());
		// Task 5
		var car2 = NeedForSpeed.nitro();
		car2.drive();
		System.out.println(car2.distanceDriven());
		// Task 6
		int distance1 = 100;
		var race1 = new RaceTrack(distance1);
		int distance2 = 300;
		var race2 = new RaceTrack(distance2);
		System.out.println(race1.canFinishRace(car));
		System.out.println(race2.canFinishRace(car));
	}

}
