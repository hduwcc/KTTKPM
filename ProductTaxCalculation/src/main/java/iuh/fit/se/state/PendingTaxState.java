package iuh.fit.se.state;

public class PendingTaxState implements InvoiceState {
    public void proceed(InvoiceContext context) {
        System.out.println("Trạng thái: Đang tính toán các loại thuế...");
        context.setState(new FinalizedPriceState());
    }
}
