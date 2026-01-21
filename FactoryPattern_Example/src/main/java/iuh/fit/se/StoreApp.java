package iuh.fit.se;

public class StoreApp {
    public static void main(String[] args) {
        // Người dùng chọn thanh toán bằng Momo
        String userChoice = "MOMO";

        // Bạn không cần dùng 'new MomoPayment()'
        // Bạn nhờ Factory làm hộ
        Payment myPayment = PaymentFactory.getPaymentMethod(userChoice);

        // Bạn chỉ việc sử dụng, không cần quan tâm nó là class cụ thể nào bên trong
        myPayment.processPayment();
    }
}
