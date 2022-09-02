package BigO.Examples;

public class UnOrderedPairs {
    public static void main(String[] args) {
        unOrderedPairs(new int[] {1,2,3,4});
    }
    private static void unOrderedPairs(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
}
// O(n^2) time complexity