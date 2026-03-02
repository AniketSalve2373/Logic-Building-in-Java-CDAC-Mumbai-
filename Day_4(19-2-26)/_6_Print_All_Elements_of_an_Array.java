import java.util.Scanner;

public class _6_Print_All_Elements_of_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}