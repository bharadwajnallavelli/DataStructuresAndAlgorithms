package Arrays.Examples;

public class SearchElement {
    public static int searchInArray(int[] intArray, int valueToSearch) {
        for(int i = 0; i < intArray.length; i++) {
            if(intArray[i] == valueToSearch) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,12};
        int target = 12;
        System.out.println(searchInArray(array,target));
    }
}
