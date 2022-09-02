package Arrays.Examples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleDimensionArray {
    int[] arr = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch(Exception e) {
            System.out.println("Array no longer exists");
        }

    }

    public void searchArray(int valueToSearch) {
        for(int i: arr) {
            if(i == valueToSearch) {
                System.out.println("Value is found");
                return;
            }
        }
        System.out.println("Value is not found");
    }

    public void deleteValue(int index) {
        try {
            arr[index] = Integer.MIN_VALUE;
            System.out.println("Value has been deleted successfully");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index provided is not in scope");
        }
    }

    public static void main(String[] args) {
        SingleDimensionArray s = new SingleDimensionArray(5);
        s.insert(0,12);
        s.insert(1,45);
        s.insert(0,18);
        s.insert(6,5);
        int firstElement = s.arr[0];
        System.out.println("firstElement" + firstElement);
        s.traverseArray();
        System.out.println(Arrays.toString(s.arr));
        s.searchArray(45);
        s.searchArray(99);
        s.deleteValue(0);
        System.out.println(Arrays.toString(s.arr));
    }
}
