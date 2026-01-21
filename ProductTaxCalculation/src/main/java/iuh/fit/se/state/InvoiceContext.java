package iuh.fit.se.state;

import iuh.fit.se.decorator.Product;
import iuh.fit.se.strategy.TaxStrategy;

public class InvoiceContext {
    private InvoiceState state = new PendingTaxState();
    private Product product;
    private TaxStrategy strategy;

    public InvoiceContext(Product product, TaxStrategy strategy) {
        this.product = product;
        this.strategy = strategy;
    }

    public void setState(InvoiceState state) { this.state = state; }

    public void process() {
        state.proceed(this);
    }

    public void printTotal() {
        double finalPrice = strategy.applyTax(product.getPrice());
        System.out.println("Sản phẩm: " + product.getDescription());
        System.out.println("Tổng giá sau thuế khu vực: " + finalPrice);
    }
}
