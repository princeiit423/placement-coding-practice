import java.util.*;

public class pairsArray {
    public static void pairArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + "," + arr[j]);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + arr[i] + " position data");
            arr[i] = sc.nextInt();
        }

        pairArray(arr);
    }
}
