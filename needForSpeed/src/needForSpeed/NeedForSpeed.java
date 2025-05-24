package needForSpeed;

class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int batteryUsed = 0;
    private int distance = 0;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return (this.batteryUsed + this.batteryDrain) > 100 ? true : false;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        // If the battery is empty, the attempt will fail
        if(!batteryDrained()){
            this.distance = this.distance + this.speed;
            this.batteryUsed = this.batteryUsed + this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50, 4);
        return car;
    }
}
