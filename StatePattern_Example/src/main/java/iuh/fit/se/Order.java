package iuh.fit.se;

public class Order {
    private String state = "PENDING";

    public void cancelOrder() {
        if (state.equals("PENDING")) {
            System.out.println("Hủy đơn thành công.");
            state = "CANCELLED";
        } else if (state.equals("SHIPPING")) {
            System.out.println("Không thể hủy! Đơn hàng đang trên đường giao.");
        } else if (state.equals("DELIVERED")) {
            System.out.println("Không thể hủy! Đơn hàng đã giao xong.");
        }
    }

    // Tương tự cho các hàm như: payOrder(), shipOrder(), confirmReceipt()...
    // Hậu quả: Code cực kỳ khó đọc. Mỗi lần thêm một trạng thái mới (ví dụ: "Chờ lấy hàng")
    // , bạn phải đi sửa tất cả các hàm cancel, pay, ship... để thêm else-if.
}
