package practice.observer.graphplotter;

public class GraphDashboard implements Observer {
    MetricsProvider metricsProvider;
    // Other fields

    public GraphDashboard(MetricsProvider metricsProvider) {
        this.metricsProvider = metricsProvider;
    }

    @Override
    public void update() {
        displayGraph();
    }

    public void displayGraph() {
        System.out.println("Memory graph: " + this.metricsProvider.getMemoryAllocated());
        System.out.println("CPU graph: " + this.metricsProvider.getCpuLoad());
        System.out.println("Network graph: " + this.metricsProvider.getNetworkLoad());
    }
}
