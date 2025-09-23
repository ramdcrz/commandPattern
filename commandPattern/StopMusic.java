package commandPattern;

public class StopMusic implements Command {
    private MusicPlayer player;

    public StopMusic(MusicPlayer player) {
        this.player = player;
    }

    public String execute() {
        return player.stop();
    }
}