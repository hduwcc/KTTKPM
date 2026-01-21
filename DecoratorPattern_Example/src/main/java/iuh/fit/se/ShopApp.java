package iuh.fit.se;

public class ShopApp {
    public static void main(String[] args) {
        // 1. Một ly trà sữa truyền thống
        MilkTea order = new PlainMilkTea();

        // 2. Khách muốn thêm trân châu
        order = new Pearl(order);

        // 3. Khách lại muốn thêm kem cheese
        order = new Cheese(order);

        System.out.println("Món: " + order.getDescription());
        System.out.println("Tổng tiền: " + order.getCost());
    }
}
