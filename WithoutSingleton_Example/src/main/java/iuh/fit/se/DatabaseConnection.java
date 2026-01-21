package iuh.fit.se;

class DatabaseConnection {
    public DatabaseConnection() {
        // Giả lập việc mở kết nối tốn thời gian và tài nguyên
        System.out.println(">>> Đang thiết lập kết nối mới tới MySQL...");
    }

    public void executeQuery(String sql) {
        System.out.println("Thực thi: " + sql);
    }
}
