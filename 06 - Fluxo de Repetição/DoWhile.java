import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;
        do {
           System.out.print("Digite um número: ");
           int n1 = sc.nextInt();
           System.out.print("Digite outro número: ");
           int n2 = sc.nextInt();
           int soma = n1 + n2;
           System.out.println("A soma é: " + soma);
           System.out.print("Deseja realizar outra operação? S/N: ");
           opcao = sc.next();
        } while (opcao.equals("S"));
        System.out.println("Fim do programa");
        sc.close();
    }
}