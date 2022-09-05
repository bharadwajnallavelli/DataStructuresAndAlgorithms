package Arrays.Examples;

import java.util.Scanner;

public class AverageTemperature {
    int arr[] = null;
    double avg = 0.0;
    int count = 0;
    public AverageTemperature(int numOfDays) {
        this.arr = new int[numOfDays];
    }
    public void insert() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < this.arr.length; i++) {
            System.out.println("Enter temperature for day " + i);
            this.arr[i] = in.nextInt();
        }
    }
    public void calculate() {
        double localSum = 0.0;
        for(int i = 0; i < this.arr.length; i++) {
            localSum += this.arr[i];
        }
        this.avg = localSum / this.arr.length;
        for(int i = 0; i < this.arr.length; i++) {
            if(this.arr[i] > this.avg) this.count++;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of days to calculate average temperature: ");
        int input = in.nextInt();
        AverageTemperature avgtemp = new AverageTemperature(input);
        avgtemp.insert();
        avgtemp.calculate();
        System.out.println("Average temperature: " + avgtemp.avg);
        System.out.println("Number of days greater than average temperature: " + avgtemp.count);

    }
}
