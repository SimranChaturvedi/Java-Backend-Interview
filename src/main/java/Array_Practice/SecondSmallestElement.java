package Array_Practice;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int arr[] = {45, 12, 78, 3, 56, 9};
        int smallest = Integer.MAX_VALUE;;
        int secondSmallest = Integer.MAX_VALUE;;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println("Second smallest element is "+  secondSmallest);
    }
}

//Looking for maximum → initialize with Integer.MIN_VALUE.
//Looking for minimum → initialize with Integer.MAX_VALUE.
//
//Complexity
//
//Time: O(n) — single traversal.
//
//Space: O(1) — only two variables.

