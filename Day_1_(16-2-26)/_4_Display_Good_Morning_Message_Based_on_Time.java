import java.util.Calendar;

class _4_Display_Good_Morning_Message_Based_on_Time {
    public static void main(String[] args) {

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        // System.out.println(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));

        if (hour < 12)
            System.out.println("Good Morning");
        else if (hour < 16)
            System.out.println("Good Afternoon");
        else if (hour < 20)
            System.out.println("Good Evening");
        else
            System.out.println("Good Night");
    }
}
