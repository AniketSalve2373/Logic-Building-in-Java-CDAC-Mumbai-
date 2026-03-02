import java.util.Scanner;

public class _5_Sum_of_Odd_Numbers_between_1_and_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);

        sc.close();
    }
}