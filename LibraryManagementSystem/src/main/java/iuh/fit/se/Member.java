package iuh.fit.se;

public class Member implements Observer {
    private String name;
    public Member(String n) { this.name = n; }
    @Override
    public void update(String msg) {
        System.out.println("[" + name + "] Nhận thông báo: " + msg);
    }
}
