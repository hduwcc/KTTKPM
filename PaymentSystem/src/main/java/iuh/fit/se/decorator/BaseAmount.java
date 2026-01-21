package iuh.fit.se.decorator;

public class BaseAmount implements PaymentAmount {
    private double cost;
    public BaseAmount(double cost) { this.cost = cost; }
    public double getCost() { return cost; }
    public String getDescription() { return "Giá gốc: " + cost; }
}
