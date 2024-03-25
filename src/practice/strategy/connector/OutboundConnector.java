package practice.strategy.connector;

public abstract class OutboundConnector<T, I> {
    private IntegrationMode integrationMode;
    private SerializationMode<T, I> serializationMode;

    public void setIntegrationMode(IntegrationMode integrationMode) {
        this.integrationMode = integrationMode;
    }

    public void setSerializationMode(SerializationMode<T, I> serializationMode) {
        this.serializationMode = serializationMode;
    }

    public T routeInput(String connectionName, I input) {
        Connection conn = integrationMode.connect(connectionName);
        return serializationMode.serialize(conn, input);

    }

    public String describe() {
        return "stub";
    }
}
