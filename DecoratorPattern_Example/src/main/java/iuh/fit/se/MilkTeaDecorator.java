package iuh.fit.se;

abstract class MilkTeaDecorator implements MilkTea {
    protected MilkTea milkTea; // Đối tượng được bọc

    public MilkTeaDecorator(MilkTea milkTea) {
        this.milkTea = milkTea;
    }
}
