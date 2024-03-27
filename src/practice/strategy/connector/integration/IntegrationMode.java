package practice.strategy.connector.integration;

import practice.strategy.connector.Connection;

public interface IntegrationMode {
    Connection connect();
}
