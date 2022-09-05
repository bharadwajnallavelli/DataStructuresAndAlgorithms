package Arrays.Examples;

public class MissingNumber {
    private static void missingNumber(int[] intArray) {
        int sum1 = 0, sum2 = 0;
        for(int i: intArray) {
            sum1 += i;
        }
        sum2 = 10 * (10 + 1) / 2;
        int diff = sum2 - sum1;
        System.out.println(diff);
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,8,9,10};
        missingNumber(array);
    }
}
