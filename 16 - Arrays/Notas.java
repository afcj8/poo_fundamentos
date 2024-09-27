import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[10];
        for (int i = 0; i < 10; i++) {
            System.err.print("Digite a nota do aluno: ");
            notas[i] = sc.nextFloat();
        }
        float totalNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            totalNotas = totalNotas + notas[i];
        }
        float media = totalNotas / notas.length;
        System.out.printf("A média das notas é: %.2f", media);
        sc.close();
    }
}