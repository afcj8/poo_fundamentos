public class Teste {
    public static void main(String[] args) {
        // Criação de um objeto Conta
        Conta cc = new Conta();

        // Atribuição de valores aos atributos do objeto
        cc.numero = 321;
        cc.agencia = 123;
        cc.saldo = 100;

        // Chamada do método depositar
        cc.depositar(50);

        // Verificação do saldo e impressão no console
        System.out.println(cc.verificarSaldo()); // 150.0

        // Criação de um objeto utilizando o construtor com parâmetros
        Conta poupanca = new Conta(111, 222, 1000);

        // Chamada do método retirar
        poupanca.retirar(50);

        // Verificação do saldo e impressão no console
        System.out.println(poupanca.verificarSaldo());  // 950.0
    }
}