import java.util.ArrayList;

public class MetodoRemove {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C#");
        lista.remove(0);
        System.out.println(lista);
    }
}