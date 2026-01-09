class Index {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2;

        if (index >= 0 && index < arr.length) {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } else {
            System.out.println("Invalid index");
        }
    }
}
