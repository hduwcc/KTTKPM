package iuh.fit.se.state;

public class FinalizedPriceState implements InvoiceState {
    public void proceed(InvoiceContext context) {
        System.out.println("Trạng thái: Đã chốt giá và xuất hóa đơn.");
    }
}
