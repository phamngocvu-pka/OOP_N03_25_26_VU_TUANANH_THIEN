import core.Recursion;

public class TestRecursion {
    public static void main(String[] args) {
        assert Recursion.factorial(5) == 120L;
        assert Recursion.fibonacci(7) == 13L;
        assert Recursion.gcd(48, 18) == 6;
        assert Recursion.reverse("abcd").equals("dcba");
        System.out.println("TestRecursion passed");
    }
}