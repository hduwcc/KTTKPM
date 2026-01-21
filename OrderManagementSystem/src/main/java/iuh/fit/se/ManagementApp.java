package iuh.fit.se;

import iuh.fit.se.decorator.BasicOrder;
import iuh.fit.se.decorator.InsuranceDecorator;
import iuh.fit.se.decorator.OrderComponent;
import iuh.fit.se.state.OrderContext;
import iuh.fit.se.strategy.FastShipping;
import iuh.fit.se.strategy.ShippingStrategy;

public class ManagementApp {
    public static void main(String[] args) {
        // 1. Tạo đơn hàng và thêm "Decorator" (Bảo hiểm)
        OrderComponent myOrder = new BasicOrder(100000);
        myOrder = new InsuranceDecorator(myOrder);

        // 2. Chọn "Strategy" (Giao hàng nhanh)
        ShippingStrategy fastShip = new FastShipping();

        // 3. Khởi tạo Context
        OrderContext context = new OrderContext(myOrder, fastShip, "Giao Hàng Nhanh");

        // 4. Chạy qua các "State"
        context.showBill();
        context.applyProcess(); // Từ Mới tạo -> Đang xử lý
        context.applyProcess(); // Từ Đang xử lý -> Đã giao
        context.applyProcess(); // Đã giao (Kết thúc)
    }
}
