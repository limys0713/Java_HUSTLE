package remoteControlCompetition;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 2
		ProductionRemoteControlCar prod = new ProductionRemoteControlCar();
		prod.drive();
		System.out.println(prod.getDistanceTravelled());
		ExperimentalRemoteControlCar exp = new ExperimentalRemoteControlCar();
		exp.drive();
		System.out.println(exp.getDistanceTravelled());
		// Task 3
		TestTrack.race(new ProductionRemoteControlCar());
		TestTrack.race(new ExperimentalRemoteControlCar());
		// this should execute without an exception being thrown
		// Task 4
		ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
		ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
		prc1.setNumberOfVictories(2);
		prc2.setNumberOfVictories(3);
		List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
		unsortedCars.add(prc1);
		unsortedCars.add(prc2);
		List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
		System.out.println(prc1);
		System.out.println(prc2);
		System.out.println(rankings.get(0)); // == prc2
		System.out.println(rankings.get(1)); // == prc1
	}

}
