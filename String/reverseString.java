public class reverseString {
    public static void revString(String s) {
        StringBuilder str = new StringBuilder("");
        for (int i = s.length(); i > 0; i--) {
            System.out.print(s.charAt(i - 1));

        }
    }

    public static void main(String args[]) {
        String s = "FAIZ";
        System.out.println(s);
        System.out.println("-----------------------------");
        revString(s);

    }
}
