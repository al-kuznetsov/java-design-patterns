package practice.strategy.connector.serialization;

import practice.strategy.connector.Connection;
import practice.strategy.connector.model.InputEntity;

public class JsonSerializationMode implements SerializationMode<String, InputEntity> {
    @Override
    public String serialize(Connection conn, InputEntity input) {
        return "Serialized JSON for connection: " + conn.describe() + " input: " + input.toString();
    }
}
