import java.util.ArrayList;

public class ExemploGenerics {
    public static void main(String[] args) {
        ArrayList<Conta> listaConta = new ArrayList<Conta>();
        Conta c1 = new Conta(1234, 4321, 50);
        Conta c2 = new Conta(4321, 1234, 25);
        Conta c3 = new Conta(5678, 8765, 75);
        
        listaConta.add(c1);
        listaConta.add(c2);
        listaConta.add(c3);

        for (Conta conta : listaConta) {
            System.out.println(conta);
        }
    }
}