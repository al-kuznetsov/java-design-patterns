package course.command.remote;

/**
 * Пример трюка Макрокоманда (MacroCommand), которая инкапсулирует другие команды.
 * Feature: Макрокоманда
 */
public class PartyOnMacroCommand implements Command {
    Command[] commands;

    public PartyOnMacroCommand(Command[] onCommands) {
        this.commands = onCommands;
    }


    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
