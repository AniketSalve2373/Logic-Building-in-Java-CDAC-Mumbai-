import java.util.Scanner;

public class Menu_Driven_Assignment {

    // -------- Problem 1: Grade Evaluation --------
    static void gradeEvaluation() {
        int[] marks = { 80, 85, 90 };
        int sum = 0;

        for (int m : marks) {
            sum += m;
        }

        int avg = sum / marks.length;
        System.out.println("Average Marks: " + avg);

        if (avg >= 90)
            System.out.println("Grade: A");
        else if (avg >= 70)
            System.out.println("Grade: B");
        else if (avg >= 50)
            System.out.println("Grade: C");
        else if (avg >= 30)
            System.out.println("Grade: D");
        else
            System.out.println("Fail");
    }

    // -------- Problem 2: Leap Year --------
    static void checkLeapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }

    // -------- Problem 3: Day of Week --------
    static void dayOfWeek() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }

    // -------- Problem 4: Default Values --------
    static void defaultValues() {

        // class variables show default values
        byte a = 0;
        short b = 0;
        int c = 0;
        long d = 0;
        float e = 0.0f;
        double f = 0.0;
        char g = '\u0000';
        boolean h = false;

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
    }

    // -------- MAIN MENU --------
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    gradeEvaluation();
                    break;
                case 2:
                    checkLeapYear();
                    break;
                case 3:
                    dayOfWeek();
                    break;
                case 4:
                    defaultValues();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        input.close();
    }
}
