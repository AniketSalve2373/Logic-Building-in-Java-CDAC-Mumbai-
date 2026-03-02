import java.util.Scanner;

public class _6_Sum_1_To_N {

    static int calculateSum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int result = calculateSum(num);

        System.out.println("The sum of numbers from 1 to " + num + " is: " + result);

        input.close();
    }
}
