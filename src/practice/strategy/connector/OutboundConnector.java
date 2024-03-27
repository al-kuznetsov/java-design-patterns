package practice.strategy.connector;

import practice.strategy.connector.integration.IntegrationMode;
import practice.strategy.connector.serialization.SerializationMode;

public abstract class OutboundConnector<T, I> {
    IntegrationMode integrationMode;
    SerializationMode<T, I> serializationMode;

    public void setIntegrationMode(IntegrationMode integrationMode) {
        this.integrationMode = integrationMode;
    }

    public void setSerializationMode(SerializationMode<T, I> serializationMode) {
        this.serializationMode = serializationMode;
    }

    public T routeInput(I input) {
        Connection conn = integrationMode.connect();
        return serializationMode.serialize(conn, input);

    }

    public String describe() {
        return "stub";
    }
}
