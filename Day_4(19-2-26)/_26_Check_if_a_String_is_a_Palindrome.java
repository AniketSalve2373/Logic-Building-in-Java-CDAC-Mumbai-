import java.util.Scanner;

public class _26_Check_if_a_String_is_a_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("The string '" + str + "' is a palindrome.");
        } else {
            System.out.println("The string '" + str + "' is not a palindrome.");
        }

        sc.close();
    }
}