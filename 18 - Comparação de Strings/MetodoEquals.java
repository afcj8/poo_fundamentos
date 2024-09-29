public class MetodoEquals {
    public static void main(String[] args) {
        String nome1 = "Antônio";
        String nome2 = new String("Antônio");
        if (nome1.equals(nome2)) {
            System.out.println("As Strings são iguais!");
        } else {
            System.out.println("As Strings são diferentes!");
        }
    }
}