package BigO.Examples;

public class SumAndProductOfArray {
    public static void main(String[] args) {
        spofArray(new int[] {1,2,3,4});
    }
    private static void spofArray(int[] array) {
        int sum = 0;
        int product = 1;
        for(int arr: array) {
            sum += arr;
            product *= arr;
        }
        System.out.println("Sum " + sum);
        System.out.println("Product " + product);
    }
}
// O(n) time complexity
