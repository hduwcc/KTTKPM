package iuh.fit.se;

public class CheckoutService {

    // Giả sử ứng dụng ban đầu chỉ có thanh toán qua Thẻ ATM.
    // Sau đó sếp yêu cầu thêm Momo, rồi tiếp theo là ZaloPay, ShopeePay, Visa...
    // Hậu quả: Logic code bị lặp lại, rất khó thay đổi, khó unittest
    public void checkout(String paymentType, double amount) {
        // Mỗi lần thanh toán là một đống logic khởi tạo phức tạp
        if (paymentType.equals("ATM")) {
            ATMPayment payment = new ATMPayment();
            payment.authenticate("User123", "Pin123"); // ATM cần mã Pin
            payment.pay(amount);
        } else if (paymentType.equals("MOMO")) {
            MomoPayment payment = new MomoPayment();
            payment.connectToWallet("0901234567"); // Momo cần số điện thoại
            payment.pay(amount);
        } else if (paymentType.equals("VISA")) {
            VisaPayment payment = new VisaPayment();
            payment.setCardInfo("1234-5678", "12/26", "123"); // Visa cần số thẻ, CVV
            payment.pay(amount);
        }
        // ... Càng thêm nhiều phương thức, hàm này càng dài hàng trăm dòng
    }
}
