
public class largestInArray {
    public static int largestNumber(int arr[]) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];

            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 67, 89, 20, 90 };
        System.out.println(largestNumber(arr));
    }
}
