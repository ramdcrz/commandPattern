package commandPattern;

public class Thermostat {
    private int temperature = 22;

    public String increaseTemp() {
        temperature++;
        return "Thermostat set to " + temperature + "°C";
    }

    public String decreaseTemp() {
        temperature--;
        return "Thermostat set to " + temperature + "°C";
    }
}