import java.util.Arrays;

class Small {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 7;

        Arrays.sort(arr);

        if (k > 0 && k <= arr.length) {
            System.out.println(k + " smallest element: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of K");
        }
    }
}
