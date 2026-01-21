package iuh.fit.se;

public class Main {
    public static void main(String[] args) {
        // Không thể ghi: DatabaseConnection db = new DatabaseConnection(); -> Lỗi Compile

        // Lần đầu tiên gọi: Đối tượng sẽ được tạo
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.query("SELECT * FROM Users");

        // Lần thứ hai gọi: Trả về ngay đối tượng đã tạo ở trên
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.query("SELECT * FROM Products");

        // Kiểm tra xem có đúng là cùng 1 đối tượng không
        if (db1 == db2) {
            System.out.println("=> db1 và db2 là CÙNG MỘT đối tượng (Singleton hoạt động!)");
        }
    }
}