import java.util.ArrayList;

public class MetodoGet {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C#");
        System.out.println(lista.get(2));
    }
}