package practice.strategy.connector.serialization;

import practice.strategy.connector.Connection;
import practice.strategy.connector.model.InputEntity;

public class XmlSerializationMode implements SerializationMode<String, InputEntity> {
    @Override
    public String serialize(Connection conn, InputEntity input) {
        return "Serialized XML for connection: " + conn.describe() + " input: " + input.toString();
    }
}
