package remoteControlCompetition;

public class ExperimentalRemoteControlCar implements RemoteControlCar{

    private int distanceTravlled;

    public ExperimentalRemoteControlCar(){
        this.distanceTravlled = 0;
    }
    
    public void drive() {
        this.distanceTravlled += 20;
    }

    public int getDistanceTravelled() {
        return this.distanceTravlled;
    }
}