public class MetodoIndexOf {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        int indice  = nome.indexOf("t");
        System.out.println("O índice do caractere 't' é: " + indice);

        int indicePalavra = nome.indexOf("Junior");
        System.out.println("O índice da palavra \"Junior\" é: " + indicePalavra);
    }
}