public class _7_Find_the_Largest_of_Three_Numbers {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        int bigNumber = 0;
        if (num1 > num2 && num1 > num3) {
            bigNumber = num1;
        } else if (num2 > num1 && num2 > num3) {
            bigNumber = num2;
        } else {
            bigNumber = num3;
        }

        System.out.println("big number is : " + bigNumber);
    }
}
