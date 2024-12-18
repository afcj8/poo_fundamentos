# 28. Criação de Exceções

Também é possível criar classes de exceção personalizadas para representar erros específicos, evitando o uso de exceções genéricas. Para isso, basta criar uma classe que herde de `Exception` (exceção verificada) ou de `RuntimeException` (exceção não verificada). Assim, o código torna-se mais claro e compreensível, já que as exceções específicas descrevem melhor o tipo de erro.

A seguir, são apresentados dois exemplos de exceções personalizadas: uma para indicar que o valor de um depósito é inválido e outra para informar que o saldo é insuficiente para um saque.

Primeiro, cria-se a exceção `ValorInvalidoException`, que será uma exceção não verificada (unchecked) e, portanto, derivada de `RuntimeException`. No Java, é convencional que as exceções terminem com o sufixo "Exception":

```
public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}
```

Em seguida, o método `depositar` é modificado para lançar essa exceção personalizada:

```
public void depositar(double valor) {
    if (valor < 0) {
        throw new ValorInvalidoException("Valor de depósito inválido: " + valor);
    }
    saldo += valor;
}
```

Agora, cria-se uma exceção verificada (checked), chamada `SaldoInsuficienteException`, que estende `Exception`:

```
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
```

Para utilizar essa exceção, é necessário declará-la na assinatura do método com `throws`:

```
public void sacar(double valor) throws SaldoInsuficienteException {
    if (valor > saldo) {
        throw new SaldoInsuficienteException("Saldo insuficiente para saque: " + valor);
    }
    saldo -= valor;
}
```

Nos exemplos acima, foram criadas exceções verificada e não verificada para ilustrar a personalização de exceções em Java. Dependendo da necessidade, pode-se optar por criar apenas um tipo de exceção para uma classe. É recomendável que exceções personalizadas incluam mensagens descritivas, facilitando a compreensão do motivo do erro e promovendo um tratamento adequado.