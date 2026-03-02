import java.util.Scanner;

public class _1_Print_Numbers_from_1_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}