package observer;

import observer.notification.Email;
import observer.notification.MoblieApp;
import observer.notification.TextMessage;
import observer.order.OrderStatus;
import observer.order.Order;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(0001, OrderStatus.REGISTERED);

        Email mail1 = new Email();
        MoblieApp mobileApp1 = new MoblieApp();
        TextMessage textMessage = new TextMessage();

        order1.registerObserver(mail1);
        order1.registerObserver(mobileApp1);
        order1.registerObserver(textMessage);

        order1.notifyObservers();
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        order1.changeStatus(OrderStatus.SENT);

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        order1.changeStatus(OrderStatus.DELIVERED);
    }
}
