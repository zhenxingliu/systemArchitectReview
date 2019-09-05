/**
 * conerateCommand 
 */
public class PlayCommand implements Command {

    private Audio1Player myAudio;

    public PlayCommand(Audio1Player audioPlayer) {
        myAudio = audioPlayer;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        myAudio.play();
    }

}