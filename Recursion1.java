public class Recursion1 {
    private static long factorial(int n) {
        // unintentional case
        if(n < 0) {
            return -1;
        }
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // recursive case
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
