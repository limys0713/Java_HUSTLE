package needForSpeed;

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while(car.distanceDriven() < this.distance){
            if(car.batteryDrained()){
                return false;
            }
            car.drive();
        }
        return true;
    }
}