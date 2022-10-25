package observer.notification;

import observer.order.Order;

public class MoblieApp implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("Mobile notification: order with number " + order.getOrderNumber() + " has status: " + order.getStatus());
    }
}
