package jedlikToyCar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JedlikToyCar car = JedlikToyCar.buy();
		System.out.println(car.distanceDisplay());
		System.out.println(car.batteryDisplay());
		car.drive();
		car.drive();
		System.out.println(car.distanceDisplay());
		System.out.println(car.batteryDisplay());
		for(int i = 0; i < 100; i++) {
			car.drive();
		}
		System.out.println(car.distanceDisplay());
		System.out.println(car.batteryDisplay());
	}

}
