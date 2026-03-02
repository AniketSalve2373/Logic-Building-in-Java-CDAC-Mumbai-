import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "aniket";
        String rev = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }

        System.out.println(rev);
        sc.close();
    }
}
