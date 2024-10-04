public class Conta {
    private int numero, agencia;
    private double saldo;

    public Conta() { }

    public Conta(int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta: " + this.numero + " - Agência: " + this.agencia + " - Saldo: " + this.saldo;
    }
}