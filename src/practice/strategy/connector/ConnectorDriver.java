package practice.strategy.connector;

import practice.strategy.connector.model.InputEntity;
import practice.strategy.connector.serialization.JsonSerializationMode;

public class ConnectorDriver {

    // Демо применения паттерна Стратегия для выделения и инкапсуляции семейства алгоритмов для интеграции и
    // сериализации/форматирования
    public static void main(String[] args) {

        // Get connector
        OutboundConnector<String, InputEntity> queueOutboundJsonConnector = new QueueOutboundJsonConnector();
        OutboundConnector<String, InputEntity> kafkaXmlOutboundConnector = new KafkaXmlOutboundConnector();

        System.out.println(kafkaXmlOutboundConnector.routeInput(new InputEntity(1, "input1")));
        System.out.println(queueOutboundJsonConnector.routeInput(new InputEntity(1, "input1")));
        System.out.println();

        // Change connector behavior at runtime (swap strategies)
        OutboundConnector<String, InputEntity> connector = queueOutboundJsonConnector;
        System.out.println(connector.routeInput(new InputEntity(1, "input2")));
        connector = kafkaXmlOutboundConnector;
        System.out.println(connector.routeInput(new InputEntity(1, "input2")));
        System.out.println();

        // Change connector behavior at runtime (tweak strategies)
        System.out.println(connector.routeInput(new InputEntity(1, "input3")));
        connector.setSerializationMode(new JsonSerializationMode());
        System.out.println(connector.routeInput(new InputEntity(1, "input3")));
    }
}
