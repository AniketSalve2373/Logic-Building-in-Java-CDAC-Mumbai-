import java.util.Scanner;

public class _2_Print_Multiples_of_3_between_1_and_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}