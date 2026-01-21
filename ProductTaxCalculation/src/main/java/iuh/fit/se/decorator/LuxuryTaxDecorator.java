package iuh.fit.se.decorator;

public class LuxuryTaxDecorator extends TaxDecorator {
    public LuxuryTaxDecorator(Product product) { super(product); }
    public double getPrice() { return product.getPrice() + 5000000; }
    public String getDescription() { return product.getDescription() + " + Thuế xa xỉ"; }
}