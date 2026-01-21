package iuh.fit.se;

public class Cheese extends MilkTeaDecorator {
    public Cheese(MilkTea milkTea) { super(milkTea); }

    public double getCost() { return milkTea.getCost() + 10000; }
    public String getDescription() { return milkTea.getDescription() + " + Kem Cheese"; }
}
