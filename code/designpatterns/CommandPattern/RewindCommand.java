public class RewindCommand implements Command {

    private Audio1Player myAudio;

    public RewindCommand(Audio1Player audioPlayer) {
        myAudio = audioPlayer;
    }

    @Override
    public void execute() {
        myAudio.rewind();
    }

}