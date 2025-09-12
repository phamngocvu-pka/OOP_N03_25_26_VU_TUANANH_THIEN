import core.User;

public class TestUser {
    public static void main(String[] args) {
        User u = new User("u01", "Nguyen Van A", "a@example.com");
        assert u.getId().equals("u01");
        assert u.getFullName().equals("Nguyen Van A");
        u.setFullName("Nguyen Van B");
        assert u.getFullName().equals("Nguyen Van B");
        System.out.println("TestUser passed");
    }
}