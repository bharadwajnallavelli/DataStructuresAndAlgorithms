package Arrays.Examples;

import java.util.Arrays;

public class TwoDimensionalArray {
    int arr[][] = null;
    public TwoDimensionalArray(int numOfRows, int numOfCols) {
        this.arr = new int[numOfRows][numOfCols];
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfCols; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }
    public void insert(int row, int col, int value) {
        try {
            if(this.arr[row][col] == Integer.MIN_VALUE) {
                this.arr[row][col] = value;
                System.out.println("Value is inserted");
            } else {
                System.out.println("Value is already present");
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }
    }
    public void access(int row, int col) {
        try {
            System.out.println(this.arr[row][col]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }
    public void traverse() {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void search(int element) {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[0].length; j++) {
                if (arr[i][j] == element) {
                    System.out.println("Found");
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
    public void delete(int row, int col) {
        try {
            System.out.println("deleting");
            this.arr[row][col] = Integer.MIN_VALUE;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range");
        }
    }
    public static void main(String[] args) {
        TwoDimensionalArray twod = new TwoDimensionalArray(3,3);
        twod.insert(0,0,12);
        System.out.println(Arrays.deepToString(twod.arr));
        twod.access(2,2);
        twod.traverse();
        twod.search(12);
        twod.delete(2,1);
    }
}
