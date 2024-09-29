public class MetodoEqualsIgnoreCase {
    public static void main(String[] args) {
        String nome1 = "antônio";
        String nome2 = new String("Antônio");
        if (nome1.equalsIgnoreCase(nome2)) { 
            System.out.println("As Strings são iguais!");
        } else {
            System.out.println("As Strings são diferentes!");
        }
    }
}