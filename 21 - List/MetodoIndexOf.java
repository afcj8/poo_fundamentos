import java.util.ArrayList;

public class MetodoIndexOf {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C#");
        int indice = lista.indexOf("Java");
        System.out.println("O valor 'Java' está na posição: " + indice);
    }
}