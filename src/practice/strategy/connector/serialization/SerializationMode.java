package practice.strategy.connector.serialization;

import practice.strategy.connector.Connection;

public interface SerializationMode<T, I> {
    T serialize(Connection conn, I input);
}
