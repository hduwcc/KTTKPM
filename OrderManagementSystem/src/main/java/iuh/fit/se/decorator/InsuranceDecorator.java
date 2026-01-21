package iuh.fit.se.decorator;

public class InsuranceDecorator extends OrderDecorator {
    public InsuranceDecorator(OrderComponent order) { super(order); }
    public double getPrice() { return order.getPrice() + 5000; }
    public String getDescription() { return order.getDescription() + " + Bảo hiểm"; }
}
