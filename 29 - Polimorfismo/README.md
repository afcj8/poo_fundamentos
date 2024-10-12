# 29. Polimorfismo

A palavra polimorfismo, segundo o dicionário Houaiss, refere-se à “qualidade ou estado de ser capaz de assumir diferentes formas”. Na programação orientada a objetos, esse conceito indica a capacidade de um método de apresentar múltiplos comportamentos, de acordo com o objeto ao qual se aplica.

Por meio do polimorfismo, um método pode executar ações diferentes dependendo da classe do objeto. Isso permite que uma variável de referência e o objeto real assumam tipos distintos, desde que a classe do objeto herde a classe da variável de referência. Assim, é possível criar um código flexível, que não requer alterações quando novos tipos de subclasses são adicionados. A principal aplicação do polimorfismo ocorre quando a superclasse e a subclasse implementam o mesmo método, porém com comportamentos distintos, processo conhecido como sobrescrita de métodos.

A seguir, é apresentada uma implementação do polimorfismo utilizando duas classes principais: `Conta` e `ContaCorrente`. Além dessas, é criada uma exceção personalizada chamada `SaldoInsuficienteException` para tratar erros relacionados a saldo insuficiente.

Primeiramente, define-se a exceção `SaldoInsuficienteException`. Essa classe estende Exception e inclui um construtor que aceita uma mensagem de erro específica, permitindo uma comunicação mais detalhada sobre a falha:

```
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
```

Em seguida, cria-se a classe `Conta`, que representa uma conta bancária genérica com um atributo `saldo` e um método `sacar`. O método lança a exceção `SaldoInsuficienteException` caso o valor a ser sacado seja superior ao saldo disponível:

```
public class Conta {
    protected double saldo;
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}
```

Posteriormente, é desenvolvida a classe `ContaCorrente`, que herda de `Conta`. Essa subclasse possui um atributo adicional `limite`, e sobrescreve o método `sacar` para incluir o limite na verificação. Se o valor solicitado for superior ao saldo mais o limite, a exceção personalizada será lançada:

```
public class ContaCorrente extends Conta {
    private double limite;
    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}
```

Por fim, a classe `Teste` contém o método `main`, que cria uma variável de referência do tipo `Conta` e armazena nela um objeto `ContaCorrente`. Em seguida, invoca o método `sacar` e trata a exceção caso o saldo seja insuficiente.

```
public class Teste {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        try {
            cc.sacar(20);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
```

Embora a variável `cc` seja do tipo `Conta`, o objeto atribuído a ela é do tipo `ContaCorrente`. Ao invocar `cc.sacar(20)`, o método que será executado é o definido na `ContaCorrente`, e não o da `Conta`. Isso ocorre porque a execução sempre é determinada pelo tipo real do objeto (polimorfismo).