package practice.observer.graphplotter;

import java.util.ArrayList;
import java.util.List;

public class MetricsProvider implements Subject {
    List<Observer> observers;
    long memoryAllocated;
    long cpuLoad;
    long networkLoad;

    public MetricsProvider() {
        this.observers = new ArrayList<>();
    }

    public long getMemoryAllocated() {
        return memoryAllocated;
    }

    public long getCpuLoad() {
        return cpuLoad;
    }

    public long getNetworkLoad() {
        return networkLoad;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void metricsUpdated() {
        notifyObservers();
    }

    public void setMetrics(long memoryAllocated, long cpuLoad, long networkLoad) {
        this.memoryAllocated = memoryAllocated;
        this.cpuLoad = cpuLoad;
        this.networkLoad = networkLoad;
        metricsUpdated();
    }
}
