package iuh.fit.se;

public class Pearl extends MilkTeaDecorator {
    public Pearl(MilkTea milkTea) { super(milkTea); }

    public double getCost() { return milkTea.getCost() + 5000; }
    public String getDescription() { return milkTea.getDescription() + " + Trân châu"; }
}