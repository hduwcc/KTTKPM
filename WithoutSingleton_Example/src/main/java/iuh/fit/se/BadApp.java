package iuh.fit.se;

public class BadApp {
    public static void main(String[] args) {
        // Giả sử ứng dụng có 3 module khác nhau cần dùng DB
        DatabaseConnection conn1 = new DatabaseConnection(); // Tạo mới 1
        DatabaseConnection conn2 = new DatabaseConnection(); // Tạo mới 2
        DatabaseConnection conn3 = new DatabaseConnection(); // Tạo mới 3

        conn1.executeQuery("SELECT * FROM users");
        conn2.executeQuery("SELECT * FROM products");

        System.out.println("Số lượng kết nối đang mở: 3 (Lãng phí RAM)");
    }
}
