package iuh.fit.se;

public class DatabaseConnection {
    // 1. Khai báo biến static để lưu trữ instance duy nhất
    // volatile giúp đảm bảo biến được đọc/ghi chính xác giữa các luồng
    private static volatile DatabaseConnection instance;
    private String connectionString;

    // 2. Private Constructor: Ngăn không cho bên ngoài dùng 'new'
    private DatabaseConnection(){
        this.connectionString = "jdbc:mysql://localhost:3306/my_db";
        System.out.println("--- Đã khởi tạo kết nối Database (Chỉ chạy 1 lần) ---");
    }

    // 3. Static Method: Điểm truy cập duy nhất
    public static DatabaseConnection getInstance() {
        if (instance == null) { // Check lần 1
            synchronized (DatabaseConnection.class) {
                if (instance == null) { // Check lần 2
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Đang thực thi lệnh: " + sql + " trên kết nối " + connectionString);
    }
}
