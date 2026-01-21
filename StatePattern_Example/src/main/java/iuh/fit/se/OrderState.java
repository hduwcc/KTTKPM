package iuh.fit.se;

public interface OrderState {
    void handleCancel(OrderContext context);
    void handleNext(OrderContext context);
}
