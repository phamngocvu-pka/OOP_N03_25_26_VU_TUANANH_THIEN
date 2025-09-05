public class TestTime {
    public static void main(String[] args) throws InterruptedException {
        Time timer = new Time();
        timer.start();

        Thread.sleep(1000); // Giả lập công việc chạy 1 giây

        timer.stop();
        System.out.println("Elapsed Time: " + timer.getElapsedTime() + " ms");
    }
}
