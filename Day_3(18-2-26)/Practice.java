import java.util.Scanner;

public class Practice {
    static void sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 5;
        sumOfNumbers(n);
    }
}
