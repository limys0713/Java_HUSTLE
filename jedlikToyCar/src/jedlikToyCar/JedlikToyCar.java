package jedlikToyCar;

public class JedlikToyCar {
	// Private variables
    private int drivenDistance;
    private int batteryPercentage;
    // Constructor
    public JedlikToyCar(){
        drivenDistance = 0;
        batteryPercentage = 100;
    }
    public static JedlikToyCar buy() {
        return new JedlikToyCar();
    }

    public String distanceDisplay() {
        // String.format() is similar to printf in C
        return String.format("Driven %d meters", drivenDistance);
    }

    public String batteryDisplay() {
        // Print %: %% in String.format()
        if(batteryPercentage == 0){
            return String.format("Battery empty");
        }
        return String.format("Battery at %d%%", batteryPercentage);
    }

    public void drive() {
        if(batteryPercentage == 0){
            return;
        }
        drivenDistance += 20;
        batteryPercentage -= 1;
    }
}
