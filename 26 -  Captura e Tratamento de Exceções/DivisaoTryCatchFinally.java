import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoTryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número: ");
            int n1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int n2 = sc.nextInt();
            int divisao = n1 / n2;
            System.out.println("O resultado é: " + divisao);
        } catch (ArithmeticException e) {
            System.err.println("Erro ao dividir");
        } catch (InputMismatchException e) {
            System.err.println("Erro de entrada de dados");
        } finally {
            System.out.println("Finalizando a execução do programa!");
            sc.close();
        }
    }
}