package observer.notification;

import observer.order.Order;

public class Email implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("Email notification: order with number " + order.getOrderNumber() + " has status: " + order.getStatus());
    }
}
