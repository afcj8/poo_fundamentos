import java.util.Scanner;

public class DivisaoTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        try {
            int divisao = n1 / n2;
            System.out.println("O resultado é: " + divisao);
        } catch (ArithmeticException e) {
            System.err.println("Erro ao dividir");
        }
        sc.close();
    }
}