package iuh.fit.se;

import iuh.fit.se.decorator.BaseAmount;
import iuh.fit.se.decorator.Discount;
import iuh.fit.se.decorator.PaymentAmount;
import iuh.fit.se.decorator.ProcessingFee;
import iuh.fit.se.state.PaymentProcessor;
import iuh.fit.se.strategy.CreditCardStrategy;
import iuh.fit.se.strategy.PaymentStrategy;

public class PaymentSystemApp {
    public static void main(String[] args) {
        // 1. Thiết lập số tiền với Decorator (Gốc 100$, có giảm giá, có phí)
        PaymentAmount finalAmount = new BaseAmount(100.0);
        finalAmount = new Discount(finalAmount);      // 100 - 5 = 95
        finalAmount = new ProcessingFee(finalAmount); // 95 + 2 = 97

        // 2. Chọn phương thức thanh toán (Strategy)
        PaymentStrategy method = new CreditCardStrategy();

        // 3. Xử lý thanh toán qua các trạng thái (State)
        PaymentProcessor processor = new PaymentProcessor(finalAmount, method);
        processor.process();
    }
}
