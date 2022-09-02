package BigO.Examples;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        reverseArray(new int[] {1,2,3,4});
    }
    private static void reverseArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int end = array.length - i - 1;
            int temp = array[i];
            array[i] = array[end];
            array[end] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
