import java.util.Calendar;

public class TestaMetodosSetGetCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1995);
        c.set(Calendar.MONTH, Calendar.MARCH);
        c.set(Calendar.DAY_OF_MONTH, 20);

        System.out.println("Nova Data: " + c.getTime());
    }
}