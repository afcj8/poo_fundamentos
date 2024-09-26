public class Conta {
    int numero, agencia;
    double saldo;

    public Conta() { }

    public Conta(int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void retirar(double valor) {
        saldo = saldo - valor;
    }

    public double verificarSaldo() {
        return saldo;
    }
}