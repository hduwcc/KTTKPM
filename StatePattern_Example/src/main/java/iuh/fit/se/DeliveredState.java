package iuh.fit.se;

// Trạng thái: Đã giao hàng
class DeliveredState implements OrderState {

    @Override
    public void handleCancel(OrderContext context) {
        System.out.println("LỖI: Đơn hàng đã giao thành công, không thể hủy. Vui lòng chọn 'Trả hàng' nếu có vấn đề.");
    }

    @Override
    public void handleNext(OrderContext context) {
        System.out.println("Đơn hàng đã ở trạng thái cuối cùng (Đã giao). Không thể chuyển tiếp.");
    }

    // Bạn có thể thêm phương thức mới chỉ riêng trạng thái này có
    public void handleReturn(OrderContext context) {
        System.out.println("Đang xử lý yêu cầu Trả hàng/Hoàn tiền...");
        // Chuyển sang RefundState nếu có
    }
}
