public class StopCommand implements Command {
    private Audio1Player myAudio;

    public StopCommand(Audio1Player audioPlayer) {
        myAudio = audioPlayer;
    }

    @Override
    public void execute() {
        myAudio.stop();
    }

}