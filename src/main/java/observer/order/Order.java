package observer.order;

import observer.notification.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable{

    private int orderNumber;
    private OrderStatus status;
    private List<Observer> listOfObservers = new ArrayList<>();

    public Order(int orderNumber, OrderStatus status) {
        this.orderNumber = orderNumber;
        this.status = status;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public void registerObserver(Observer observer) {
        listOfObservers.add(observer);
        System.out.println("Added observer");
    }

    @Override
    public void unregisterObserver(Observer observer) {
        listOfObservers.remove(observer);
        System.out.println("Removed observer");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : listOfObservers) {
            observer.update(this);
        }
    }

    public void changeStatus(OrderStatus status)  {
        this.status = status;
        notifyObservers();
    }
}
