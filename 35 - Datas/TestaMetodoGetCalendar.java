import java.util.Calendar;

public class TestaMetodoGetCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + (c.get(Calendar.MONTH) + 1)); // Adiciona 1 pois começa em 0
        System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
    }
}