public class peakElement {
    public static int peakELement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 3, 8, 9, 5, 2 };
        System.out.print(peakELement(arr));
    }
}
