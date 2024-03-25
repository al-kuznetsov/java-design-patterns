package course.command.remote;

public interface Command {
    void execute();

    void undo();
}
