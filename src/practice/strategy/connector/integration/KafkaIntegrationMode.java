package practice.strategy.connector.integration;

import practice.strategy.connector.Connection;

public class KafkaIntegrationMode implements IntegrationMode {
    @Override
    public Connection connect() {
        return new Connection("Kafka connection");
    }
}
