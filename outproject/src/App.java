public class App {
    public static void main(String[] args) {
        System.out.println("=== TEST USER ===");
        TestUser testUser = new TestUser();
        testUser.run();

        System.out.println("\n=== TEST TIME ===");
        TestTime testTime = new TestTime();
        testTime.run();

        System.out.println("\n=== TEST RECURSION ===");
        TestRecursion testRecursion = new TestRecursion();
        testRecursion.run();
    }
}
