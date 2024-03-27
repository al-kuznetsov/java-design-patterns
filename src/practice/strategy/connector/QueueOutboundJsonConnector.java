package practice.strategy.connector;

import practice.strategy.connector.OutboundConnector;
import practice.strategy.connector.integration.QueueIntegrationMode;
import practice.strategy.connector.model.InputEntity;
import practice.strategy.connector.serialization.JsonSerializationMode;

public class QueueOutboundJsonConnector extends OutboundConnector<String, InputEntity> {
    public QueueOutboundJsonConnector() {
        this.integrationMode = new QueueIntegrationMode();
        this.serializationMode = new JsonSerializationMode();
    }
}
