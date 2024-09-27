# 13. Herança

Uma classe que herda de outra é denominada subclasse, enquanto a classe de onde se herda é chamada de superclasse. A herança permite a reutilização de atributos e métodos de classes já definidas, possibilitando a criação de novas classes mais especializadas a partir de classes genéricas existentes.

Uma classe pode ter apenas uma superclasse, ou seja, a herança múltipla não é permitida. No entanto, uma classe pode ter um número ilimitado de subclasses. Dessa maneira, uma subclasse herda todas as características da superclasse, bem como de todas as classes acima dela na hierarquia.

A hierarquia de classes tem início na classe `Object`, a qual é a superclasse de todas as classes, seja de forma direta ou indireta, conforme ilustrado na Figura 13.1 a seguir:

<div align="center">
    <img src="../imgs/hierarquia.png" width="40%" style="max-height: 60vh;"/>
    <p>Figura 13.1: Hierarquia de classes.</p>
</div>

Conforme ilustrado na figura acima, a classe `Object` é a superclasse da classe `A`, que, por sua vez, serve como superclasse das classes `B` e `C`. Dessa forma, as classes `B` e `C` herdam todos os atributos e métodos da classe `A`, e, por conseguinte, da classe `Object`.

A palavra-chave `extends` é utilizada na declaração de uma classe para indicar sua superclasse. Se a classe não incluir essa palavra-chave em sua declaração, a herança será feita diretamente da classe `Object`. A sintaxe para declarar uma subclasse é a seguinte:

```
[public] class <subclasse> extends <superclasse> {
}
```

Dessa forma, a estrutura de herança em Java facilita a organização e reutilização de código, promovendo a especialização e a extensibilidade das classes.

## 13.1. Prática

Modifique a classe `Conta` para que ela tenha as subclasses `ContaCorrente` e `ContaPoupanca`. A classe `Conta` herda diretamente da classe `Object`.

```
public class Conta {
    private int numero, agencia;
    private double saldo;

    public Conta() { }

    public Conta(int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void retirar(double valor) {
        saldo -= valor;
    }

    public double verificarSaldo() {
        return getSaldo();
    }
}
```

A classe `ContaCorrente` possui dois atributos adicionais: o tipo de conta, que pode ser "básica", "especial" ou "premium", e o valor do cheque especial, que representa o limite de crédito adicional disponível ao cliente. Já a classe `ContaPoupanca` não apresenta essas distinções. Abaixo está a implementação inicial da classe `ContaCorrente`, que herda da classe `Conta`:

```
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
```