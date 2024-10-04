import java.util.ArrayList;

public class MetodoSet {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.set(1, "C#");
        System.out.println(lista);
    }
}