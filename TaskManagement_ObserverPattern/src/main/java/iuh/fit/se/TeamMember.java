package iuh.fit.se;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }


    @Override
    public void update(String taskName, String status) {
        System.out.println("Thông báo cho [" + name + "]: Công việc '"
                + taskName + "' đã chuyển sang trạng thái: " + status);
    }
}
