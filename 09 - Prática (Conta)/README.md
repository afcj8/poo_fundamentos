# 9. Prática

Para ilustrar os conceitos abordados, pode-se criar uma classe `Conta` com os atributos `saldo`, `agencia` e `numero`, além de métodos para realizar operações de saque, depósito e consulta de saldo. São definidos dois construtores: um padrão (sem parâmetros) e outro que recebe os valores de `numero`, `agencia` e `saldo`. O código a seguir exemplifica essa implementação:

```
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
```