package iuh.fit.se;

public class OrderContext {
    private OrderState state = new PendingState(); // Mặc định là chờ thanh toán

    public void setState(OrderState state) {
        this.state = state;
    }

    public void clickCancel() {
        state.handleCancel(this);
    }

    public void nextStep() {
        state.handleNext(this);
    }
}