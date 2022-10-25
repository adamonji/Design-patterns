package observer.notification;

import observer.order.Order;

public class TextMessage implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("Text message: order with number " + order.getOrderNumber() + " has status: " + order.getStatus());
    }
}
