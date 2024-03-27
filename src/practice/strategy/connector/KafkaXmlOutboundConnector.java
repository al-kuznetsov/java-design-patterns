package practice.strategy.connector;

import practice.strategy.connector.integration.KafkaIntegrationMode;
import practice.strategy.connector.model.InputEntity;
import practice.strategy.connector.serialization.XmlSerializationMode;

public class KafkaXmlOutboundConnector extends OutboundConnector<String, InputEntity> {
    public KafkaXmlOutboundConnector() {
        this.integrationMode = new KafkaIntegrationMode();
        this.serializationMode = new XmlSerializationMode();
    }
}
