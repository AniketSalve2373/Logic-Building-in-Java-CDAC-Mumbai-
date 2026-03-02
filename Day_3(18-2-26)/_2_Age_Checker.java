import java.util.Scanner;

public class _2_Age_Checker {

    static void checkAgeCategory(int age) {

        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        checkAgeCategory(age);

        input.close();
    }
}
