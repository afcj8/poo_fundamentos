import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Criação do Scanner
        int idade = sc.nextInt(); // Leitura de um número inteiro
        System.out.println("Idade digitada: " + idade); // Exibição do valor lido
        sc.close(); // Fechamento do Scanner
    }
}