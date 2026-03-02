public class _2_Leap_Year {
    public static void main(String[] args) {

        int[] Years = { 2024, 2000, 1944, 2002, 1900 };

        for (int i = 0; i < Years.length; i++) {

            int year = Years[i];

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }
}
