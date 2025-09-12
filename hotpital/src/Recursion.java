package core;

/**
 * Ví dụ các phương thức đệ quy cơ bản.
 * Bạn có thể chọn 1-2 phương thức phù hợp với đề tài nhóm.
 */
public class Recursion {
    // Giai thừa n! (n >= 0)
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n <= 1) return 1L;
        return n * factorial(n - 1);
    }

    // Fibonacci: 0,1,1,2,3,5,... (đệ quy đơn giản)
    public static long fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Ước chung lớn nhất (GCD) — đệ quy Euclid
    public static int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    // Đảo chuỗi (reverse) — đệ quy
    public static String reverse(String s) {
        if (s == null || s.length() <= 1) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}