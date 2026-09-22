package Array_Practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int left=0;
        int right=arr.length-1;

        System.out.println("original array "+ Arrays.toString(arr));

        while(left<right){
            int temp= arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array "+ Arrays.toString(arr));
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)
