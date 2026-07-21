//Code
public class ArrayPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }
}

//Output
(1, 2)
(1, 3)
(1, 4)
(2, 3)
(2, 4)
(3, 4)
