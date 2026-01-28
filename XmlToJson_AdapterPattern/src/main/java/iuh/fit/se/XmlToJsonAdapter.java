package iuh.fit.se;

public class XmlToJsonAdapter implements JsonWebService{
    private XmlLegacySystem xmlSystem;

    public XmlToJsonAdapter(XmlLegacySystem xmlSystem) {
        this.xmlSystem = xmlSystem;
    }


    @Override
    public void requestJsonData(String jsonContent) {
        // Trong thực tế, bạn sẽ dùng thư viện như Jackson hoặc GSON ở đây
        // Ở đây ta mô phỏng quá trình chuyển đổi
        String xmlData = xmlSystem.getXmlData();
        String convertedJson = convertXmlToJson(xmlData);

        System.out.println("--- Đang gửi dữ liệu tới Web Service ---");
        System.out.println("Dữ liệu gốc (XML): " + xmlData);
        System.out.println("Dữ liệu sau khi Adapter chuyển đổi (JSON): " + convertedJson);
    }

    private String convertXmlToJson(String xml) {
        // Logic giả lập chuyển đổi XML -> JSON
        return "{ \"note\": { \"to\": \"User\", \"from\": \"Admin\", \"content\": \"Hello từ XML!\" } }";
    }
}
