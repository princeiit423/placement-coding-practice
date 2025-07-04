public class peakinArray {
    public static int peak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 3, 8, 9, 5, 2 };
        System.out.print(peak(arr)); // return index of peak element
    }
}
