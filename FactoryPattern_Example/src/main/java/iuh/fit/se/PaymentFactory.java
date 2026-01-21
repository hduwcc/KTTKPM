package iuh.fit.se;

public class PaymentFactory {
    // Phương thức để tạo đối tượng dựa trên tham số đầu vào
    public static Payment getPaymentMethod(String type) {
        if (type.equalsIgnoreCase("VISA")) {
            return new VisaPayment();
        } else if (type.equalsIgnoreCase("MOMO")) {
            return new MomoPayment();
        }
        throw new IllegalArgumentException("Phương thức thanh toán không hợp lệ!");
    }
}
