package commandPattern;

public class TurnOffLight implements Command {
    private Light light;

    public TurnOffLight(Light light) {
        this.light = light;
    }

    public String execute() {
        return light.turnOff();
    }
}
