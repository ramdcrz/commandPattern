package commandPattern;

public class PlayMusic implements Command {
    private MusicPlayer player;

    public PlayMusic(MusicPlayer player) {
        this.player = player;
    }

    public String execute() {
        return player.play();
    }
}