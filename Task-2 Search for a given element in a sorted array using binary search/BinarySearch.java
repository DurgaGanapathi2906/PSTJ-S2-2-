//Code
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int key = sc.nextInt();
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Found at index " + mid);
                return;
            }
            if (key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        System.out.println("Not Found");
    }
}

//Output
60
Found at index 5
