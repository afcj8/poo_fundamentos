import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatandoSaidaDatas {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();

        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data completa: " + f.format(data));

        f = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Data sem o dia: " + f.format(data));

        f = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data resumida 1: " + f.format(data));

        f = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Data resumida 2: " + f.format(data));
    }
}