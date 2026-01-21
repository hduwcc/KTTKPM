package iuh.fit.se.decorator;

public abstract class AmountDecorator implements PaymentAmount {
    protected PaymentAmount tempAmount;
    public AmountDecorator(PaymentAmount amount) { this.tempAmount = amount; }
}
