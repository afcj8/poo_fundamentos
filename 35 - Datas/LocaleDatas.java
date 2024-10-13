import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleDatas {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();

        Locale brasil = new Locale("pt", "BR");
        Locale eua = Locale.US;
        Locale italia = Locale.ITALY;

        DateFormat f1 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        System.out.println("Data brasileira: " + f1.format(data));

        DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, eua);
        System.out.println("Data americana: " + f2.format(data));

        DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, italia);
        System.out.println("Data italiana: " + f3.format(data));
    }
}