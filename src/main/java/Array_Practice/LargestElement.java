package Array_Practice;

public class LargestElement {
    public static void main(String[] args) {

        int arr[] = {10, 2, 3, 4, 67, 89, 55};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element in the given array = " + max);

        //TC O(n) time and O(1) space
    }
}
