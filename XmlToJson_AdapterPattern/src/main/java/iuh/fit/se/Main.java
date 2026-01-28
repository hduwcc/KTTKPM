package iuh.fit.se;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo hệ thống XML cũ
        XmlLegacySystem legacySystem = new XmlLegacySystem();

        // 2. Tạo Adapter để đóng gói hệ thống cũ lại
        JsonWebService adapter = new XmlToJsonAdapter(legacySystem);

        // 3. Client gọi phương thức JSON, nhưng bên dưới Adapter tự xử lý XML
        adapter.requestJsonData("Yêu cầu lấy dữ liệu");
    }
}