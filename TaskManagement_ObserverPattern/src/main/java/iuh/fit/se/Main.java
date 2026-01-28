package iuh.fit.se;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Tạo một task mới
        Task devTask = new Task("Thiết kế Database");

        // Các thành viên đăng ký theo dõi
        TeamMember dev1 = new TeamMember("Anh Định");
        TeamMember manager = new TeamMember("Chị Sơn");

        devTask.addObserver(dev1);
        devTask.addObserver(manager);

        // Thay đổi trạng thái task -> Thông báo tự động gửi đi
        System.out.println("--- Cập nhật tiến độ lần 1 ---");
        devTask.setStatus("Đang thực hiện (In Progress)");

        System.out.println("\n--- Cập nhật tiến độ lần 2 ---");
        devTask.setStatus("Hoàn thành (Done)");
    }
}