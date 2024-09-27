public class ContaCorrente extends Conta {
    private String tipo;
    private double chequeEspecial;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double saldoDisponivel() {
        return getSaldo() + chequeEspecial;
    }
}