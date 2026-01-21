package iuh.fit.se;

public class VisaPayment implements Payment {
    public void processPayment() {
        System.out.println("Đang xử lý thanh toán qua thẻ VISA (Cần kiểm tra số thẻ...)");
    }
}
