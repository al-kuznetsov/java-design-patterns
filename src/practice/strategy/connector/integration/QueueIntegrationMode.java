package practice.strategy.connector.integration;

import practice.strategy.connector.Connection;

public class QueueIntegrationMode implements IntegrationMode {
    @Override
    public Connection connect() {
        return new Connection("Queue connection");
    }
}
