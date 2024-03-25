package practice.strategy.connector;

public class Connection {
    private final String name;

    public Connection(String name) {
        this.name = name;
    }

    public String describe() {
        return name;
    }
}
