package iuh.fit.se;

public class ShopApp {
    public static void main(String[] args) {
        OrderContext order = new OrderContext(); // 1. Bắt đầu: Pending

        System.out.println("--- Giai đoạn 1 ---");
        order.nextStep(); // Chuyển từ Pending -> Shipping

        System.out.println("--- Giai đoạn 2 ---");
        order.nextStep(); // Chuyển từ Shipping -> Delivered

        System.out.println("--- Giai đoạn 3 (Thử hủy khi đã giao) ---");
        order.clickCancel(); // Kết quả: "LỖI: Đơn hàng đã giao thành công..."

        System.out.println("--- Giai đoạn 4 (Thử chuyển tiếp) ---");
        order.nextStep(); // Kết quả: "Đơn hàng đã ở trạng thái cuối cùng..."
    }
}