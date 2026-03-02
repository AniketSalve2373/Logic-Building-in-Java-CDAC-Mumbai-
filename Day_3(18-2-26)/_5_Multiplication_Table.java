import java.util.Scanner;

public class _5_Multiplication_Table {

    static void printMultiplicationTable(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        printMultiplicationTable(number);

        input.close();
    }
}
