package commandPattern;

public class TurnOnLight implements Command {
    private Light light;

    public TurnOnLight(Light light) {
        this.light = light;
    }

    public String execute() {
        return light.turnOn();
    }
}
