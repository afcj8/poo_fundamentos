# 8. Métodos

Os métodos de uma classe definem os comportamentos que os objetos derivados dela podem realizar. Um comportamento pode ser entendido como uma ação ou um serviço prestado pelo objeto. Por exemplo, em uma classe `Conta`, comportamentos como "recuperar o saldo", "depositar" e "retirar dinheiro" representam ações que o objeto pode executar.

Um método, portanto, é um comportamento específico que pertence a um objeto e define como ele deve agir quando solicitado, descrevendo suas habilidades. Por convenção, os nomes dos métodos devem seguir o padrão lowerCamelCase, assim como os atributos. Além disso, recomenda-se o uso de verbos para nomeá-los, uma vez que representam ações. Exemplos incluem `exibirSaldo`, `depositar` e `calcularTaxa`.

A estrutura básica para a declaração de um método é a seguinte:

```
<modificador> <tipo de retorno> <nomeDoMetodo>(<[lista de parâmetros]>) {
    instruções;
}
```

No código abaixo, são definidos os métodos `recuperarSaldo` e `depositar`:

```
public class Conta {
    // atributo
    double saldo;

    // métodos
    public double recuperarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }
}
```

Para que o método possa devolver um valor, é necessário definir o tipo de retorno. No exemplo acima, o método `recuperarSaldo` retorna um valor do tipo `double`, utilizando a instrução `return` para devolver o valor armazenado no atributo `saldo`.

Caso o método não precise retornar um valor, utiliza-se o tipo de retorno `void`, como no caso do método `depositar`, que apenas atualiza o valor do saldo, sem retornar nada.

Além disso, métodos podem receber valores por meio de parâmetros. Esses parâmetros são declarados na lista de argumentos, que consiste em variáveis separadas por vírgulas e definidas entre parênteses. Quando o método é chamado, os parâmetros recebem valores e se comportam como variáveis locais dentro do método. Conforme o exemplo a seguir:

```
double somar(double valor1, double valor2) {
    return valor1 + valor2;
}
```

Nesse caso, o método `somar` recebe dois parâmetros (`valor1` e `valor2`) e retorna a soma de ambos. Dessa forma, os métodos fornecem aos objetos a capacidade de executar ações específicas, sendo essenciais para a implementação de comportamentos nas classes.