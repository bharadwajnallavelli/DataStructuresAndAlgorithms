package BigO.Examples;

public class Pairs {
    public static void main(String[] args) {
        pairs(new int[] {1,2,3,4});
    }
    private static void pairs(int[] array) {
        for(int i: array) {
            for(int j: array) {
                System.out.println(i + "," + j);
            }
        }
    }
}
// O(n^2) time complexity
