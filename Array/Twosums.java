public class Twosums {
    public static void sums(int arr[], int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + "," + j);
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 4, 3, 7, 8 };
        int target = 7;
        sums(arr, target);
    }
}
