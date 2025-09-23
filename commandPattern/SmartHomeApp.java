package commandPattern;

public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer player = new MusicPlayer();

        SmartHomeHub hub = new SmartHomeHub();

        hub.setCommand(new TurnOnLight(light));
        System.out.println(hub.pressButton());

        hub.setCommand(new TurnOffLight(light));
        System.out.println(hub.pressButton());

        hub.setCommand(new IncreaseTemp(thermostat));
        System.out.println(hub.pressButton());

        hub.setCommand(new DecreaseTemp(thermostat));
        System.out.println(hub.pressButton());

        hub.setCommand(new PlayMusic(player));
        System.out.println(hub.pressButton());

        hub.setCommand(new StopMusic(player));
        System.out.println(hub.pressButton());
    }
}
