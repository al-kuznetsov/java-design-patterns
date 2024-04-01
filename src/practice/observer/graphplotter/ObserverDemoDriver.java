package practice.observer.graphplotter;

public class ObserverDemoDriver {
    public static void main(String[] args) {
        MetricsProvider metricsProvider = new MetricsProvider();
        metricsProvider.setMetrics(200, 20, 12);

        GraphDashboard graphDashboard = new GraphDashboard(metricsProvider);

        graphDashboard.displayGraph();
        System.out.println();
        graphDashboard.displayGraph();
        System.out.println();

        metricsProvider.setMetrics(256, 55, 33);
        graphDashboard.displayGraph();
    }
}
