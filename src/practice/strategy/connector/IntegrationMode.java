package practice.strategy.connector;

public interface IntegrationMode {
    Connection connect(String connectionName);
}
