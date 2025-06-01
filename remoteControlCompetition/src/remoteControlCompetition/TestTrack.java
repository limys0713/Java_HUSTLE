package remoteControlCompetition;
import java.util.List;

public class TestTrack{

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        // Use sorting method in List
        cars.sort(null); // Return void, just undergo sorting action, hence cannot write return cars.sort(null);
        return cars;
    }
}
