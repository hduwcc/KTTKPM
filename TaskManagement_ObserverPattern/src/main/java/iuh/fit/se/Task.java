package iuh.fit.se;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private List<Observer> observers = new ArrayList<>();
    private String taskName;
    private String status;

    public Task(String taskName){
        this.taskName = taskName;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void setStatus(String status) {
        this.status = status;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(taskName, status);
        }
    }
}
