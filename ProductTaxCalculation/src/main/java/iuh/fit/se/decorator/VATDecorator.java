package iuh.fit.se.decorator;

public class VATDecorator extends TaxDecorator {
    public VATDecorator(Product product) { super(product); }
    public double getPrice() { return product.getPrice() * 1.1; }
    public String getDescription() { return product.getDescription() + " + VAT 10%"; }
}
