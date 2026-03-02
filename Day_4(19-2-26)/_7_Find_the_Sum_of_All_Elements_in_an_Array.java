import java.util.Scanner;

public class _7_Find_the_Sum_of_All_Elements_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            sum += num;
        }

        System.out.println("The sum of all numbers is: " + sum);

        sc.close();
    }
}