package Recursion.Examples;

public class RecursionCode {
    // Factorial
    private static int factorial(int n) {
        if(n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
    // Fibonacci
    private static int fibonacci(int n) {
        if(n < 0) return -1;
        if(n == 0 || n == 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    // Sum of digits
    private static int sumOfDigits(int n) {
        if(n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
    // power
    private static int power(int base, int exponent) {
        if(exponent < 0) return -1;
        if(exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }
    // decimal to binary
    private static int decimalToBinary(int n) {
        if(n == 0) return 0;
        return n % 2 + 10 * decimalToBinary(n / 2);
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(fibonacci(7));
        System.out.println(sumOfDigits(13));
        System.out.println(power(2,3));
        System.out.println(decimalToBinary(10));
    }
}
