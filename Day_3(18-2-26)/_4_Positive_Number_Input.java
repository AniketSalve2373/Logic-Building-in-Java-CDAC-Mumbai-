import java.util.Scanner;

public class _4_Positive_Number_Input {

    static void askForPositiveNumber() {

        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a positive number: ");
            num = input.nextInt();
        } while (num <= 0);

        System.out.println("You entered a positive number: " + num);

        input.close();
    }

    public static void main(String[] args) {
        askForPositiveNumber();
    }
}
