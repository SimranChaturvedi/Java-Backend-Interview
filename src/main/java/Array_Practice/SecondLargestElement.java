package Array_Practice;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondLargest = max;
                max = num;
            } else if (num > secondLargest && num != max) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest " + secondLargest);
    }
}

//        Time Complexity: O(n) — one traversal.
//        Space Complexity: O(1) — only two variables.
//
//        ⭐ Important interview point
//        The nice thing about  current solution is that it also handles negative numbers: