package practice.strategy.connector;

public interface SerializationMode<T, I> {
    T serialize(Connection conn, I input);
}
