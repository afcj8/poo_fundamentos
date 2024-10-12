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