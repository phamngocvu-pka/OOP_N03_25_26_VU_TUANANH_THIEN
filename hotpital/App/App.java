package app;

import core.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        // Gọi các test đơn giản (demo)
        User user = new User("u99", "Pham Vu", "vu@example.com");
        System.out.println(user);

        Time t = new Time(LocalDateTime.of(2025, 9, 1, 8, 0), ZoneId.of("Asia/Bangkok"));
        System.out.println("Time format: " + t.format("yyyy-MM-dd HH:mm z"));

        long hours = Time.diff(
            t.getValue(),
            t.getValue().plusHours(5),
            ChronoUnit.HOURS
        );
        System.out.println("Diff hours: " + hours);

        System.out.println("5! = " + Recursion.factorial(5));
        System.out.println("fib(10) = " + Recursion.fibonacci(10));
        System.out.println("gcd(48,18) = " + Recursion.gcd(48,18));
        System.out.println("reverse('java') = " + Recursion.reverse("java"));
    }
}