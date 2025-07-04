public class firstAndLastPositionInSortedArray {
    public static int search(int nums[], int target, boolean isStart) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        int arr[] = { -1, -1 };
        arr[0] = search(nums, target, true);
        if (arr[0] != -1) {
            arr[1] = search(nums, target, false);
        }
        // print answer of array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
