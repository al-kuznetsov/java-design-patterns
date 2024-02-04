package command.remote;

public class Remote {
    Command[] onCommands;
    Command[] offCommands;

    // feature: функция отмены (undo)
    Command undoCommand;

    public Remote() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    // feature: функция отмены (undo)
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Remote Control Slots:");
        sb.append(System.lineSeparator());

        for (int i = 0; i < 7; i++) {
            sb.append("slot ")
                    .append(i)
                    .append(": ")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append(" --- ")
                    .append(offCommands[i].getClass().getSimpleName())
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }


}
