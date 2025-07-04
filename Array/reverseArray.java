
public class reverseArray {
    public static void reverseArray(int arr[]) {
        for (int i = arr.length; i > 0; i--) {
            System.out.print(arr[i - 1] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 1, 6, 7, 43, 1, 90 };
        reverseArray(arr);
    }
}
