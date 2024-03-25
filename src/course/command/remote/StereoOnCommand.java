package course.command.remote;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setRadio();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
