//Code
import java.util.Arrays;
public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19, 1};
        int k = 3;
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println(k + "rd smallest element is: " + arr[k - 1]);
    }
}

//Output
Sorted Array: [1, 3, 5, 7, 12, 19]
3rd smallest element is: 5
