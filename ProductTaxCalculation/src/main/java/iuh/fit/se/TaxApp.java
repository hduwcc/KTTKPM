package iuh.fit.se;

import iuh.fit.se.decorator.Laptop;
import iuh.fit.se.decorator.LuxuryTaxDecorator;
import iuh.fit.se.decorator.Product;
import iuh.fit.se.decorator.VATDecorator;
import iuh.fit.se.state.InvoiceContext;
import iuh.fit.se.strategy.TaxStrategy;
import iuh.fit.se.strategy.VietnamTaxStrategy;

public class TaxApp {
    public static void main(String[] args) {
        // 1. Tạo sản phẩm gốc
        Product myLaptop = new Laptop();

        // 2. Decorator: Thêm các loại thuế chồng lên nhau
        myLaptop = new VATDecorator(myLaptop);
        myLaptop = new LuxuryTaxDecorator(myLaptop);

        // 3. Strategy: Chọn khu vực tính thuế (Việt Nam)
        TaxStrategy vnTax = new VietnamTaxStrategy();

        // 4. State: Quản lý quy trình hóa đơn
        InvoiceContext invoice = new InvoiceContext(myLaptop, vnTax);

        invoice.printTotal();
        invoice.process(); // Chuyển từ Chờ tính sang Hoàn thành
        invoice.process(); // Chốt hóa đơn
    }
}
