//Problem Statement:Given an array of integers and a positive integer 'k' write a program to find kth smallest element.
//Code:
import java.util.Arrays;
public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 8, 67, 23, 91, 34};
        int k = 3;
        Arrays.sort(arr);

        System.out.println("The " + k + "rd smallest element is: " + arr[k - 1]);
    }
}


//Output:
The 3rd smallest element is: 23
