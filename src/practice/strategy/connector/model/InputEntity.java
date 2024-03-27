package practice.strategy.connector.model;

public class InputEntity {
    private Integer id;
    private String payload;

    public InputEntity(Integer id, String payload) {
        this.id = id;
        this.payload = payload;
    }

    public Integer getId() {
        return id;
    }

    public String getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "InputEntity{" +
                "id=" + id +
                ", payload='" + payload + '\'' +
                '}';
    }
}
