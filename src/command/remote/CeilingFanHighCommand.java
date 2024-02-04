package command.remote;

public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevLevel;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevLevel = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (prevLevel) {
            case CeilingFan.HIGH -> ceilingFan.high();
            case CeilingFan.MEDIUM -> ceilingFan.medium();
            case CeilingFan.LOW -> ceilingFan.low();
            case CeilingFan.OFF -> ceilingFan.off();
        }
    }
}
