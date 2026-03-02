import java.util.Scanner;

public class _8_Print_All_Names_in_a_String_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[4];

        System.out.println("Enter 4 names:");
        for (int i = 0; i < 4; i++) {
            names[i] = sc.next();
        }

        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}