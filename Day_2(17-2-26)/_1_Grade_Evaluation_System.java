public class _1_Grade_Evaluation_System {
    public static void main(String[] args) {
        int[] marks = { 77, 88, 92, 90, 97 };

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        int avg = sum / marks.length;
        System.out.println("Average Marks : " + avg);

        if (avg >= 90) {
            System.out.println("Grade A");
        } else if (avg >= 70 && avg <= 89) {
            System.out.println("Grade B");
        } else if (avg >= 50 && avg <= 69) {
            System.out.println("Grade C");
        } else if (avg >= 30 && avg <= 49) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

    }
}