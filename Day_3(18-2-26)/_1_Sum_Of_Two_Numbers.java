import java.util.Scanner;

public class _1_Sum_Of_Two_Numbers {
    static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1, num2;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter number 1: ");
        num1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter number 2");
        num2 = sc2.nextInt();

        int sum = sumOfTwoNumbers(num1, num2);
        System.out.println("sum is : " + sum);

        sc1.close();
        sc2.close();
    }
}