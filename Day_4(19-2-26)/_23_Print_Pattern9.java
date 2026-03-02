public class _23_Print_Pattern9 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int space = 5; space > i; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int space = 5; space > i; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}