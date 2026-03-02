import java.util.Scanner;

public class _14_Find_the_Index_of_an_Element_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] arr = new Integer[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (arr[i] == search) {
                System.out.println("found at index : " + i);
            } else {
                continue;
            }
        }

        sc.close();
    }
}