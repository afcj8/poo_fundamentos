public class MetodoSplit {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        String[] palavras = nome.split(" ");
        for (String p : palavras) {
            System.out.println(p);
        }
    }
}