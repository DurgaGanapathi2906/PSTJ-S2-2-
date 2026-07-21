//Code
public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {12, 45, 8, 67, 23, 91, 34};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element = " + max);
    }
}

//Output
Maximum element = 91
