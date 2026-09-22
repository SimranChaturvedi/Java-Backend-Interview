package Array_Practice;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = {45, 12, 78, 3, 56, 9};
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}

//Time Complexity: O(n)
//
//You traverse the array once.
//
//Space Complexity: O(1)