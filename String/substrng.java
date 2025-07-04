import java.util.*;

public class substrng {
    public static void main(String args[]) {
        System.out.print("enter string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("enter starting index: ");
        int si = sc.nextInt();
        System.out.print("enter ending index: ");
        int ei = sc.nextInt();

        String substr = "";
        for (int i = si; i <= ei; i++) {
            substr = substr + s.charAt(i);
            System.out.println(substr);
        }
    }
}
