package Recursion.Examples;

public class RecursionSample {
    static void firstMethod() {
        secondMethod();
        System.out.println("first method is called");
    }
    static void secondMethod() {
        thirdMethod();
        System.out.println("second method is called");
    }
    static void thirdMethod() {
        fourthMethod();
        System.out.println("third method is called");
    }
    static void fourthMethod() {
        System.out.println("fourth method is called");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}
