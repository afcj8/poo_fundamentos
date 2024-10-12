# 27. Propagação de Exceções

Um método pode optar por não tratar uma exceção e, em vez disso, propagá-la para o método que o chamou. Dessa forma, o método chamador é notificado sobre a ocorrência de uma exceção. exemplo a seguir, é criada uma classe chamada `Calculadora`, responsável por implementar operações aritméticas, como a divisão:

```
public class Calculadora {
    public int divisao(int n1, int n2) {
        return n1 / n2;
    }
}
```

Caso o valor de `n2` seja zero, o método lançará uma exceção. Embora seja possível tratar a exceção com `try-catch`, isso pode ocultar o erro do método chamador:

```
public class Calculadora {
    public int divisao(int n1, int n2) {
        try {
            return n1 / n2;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
```

A alternativa mais eficaz é propagar a exceção para o chamador, permitindo que ele trate o erro. Para isso, utiliza-se a cláusula `throws` na assinatura do método:

```
public class Calculadora {
    public int divisao(int n1, int n2) throws ArithmeticException {
        return n1 / n2;
    }
}
```

Métodos podem lançar múltiplos tipos de exceções, bastando listá-las separadas por vírgulas na cláusula `throws`. Dessa forma, as exceções que o método pode gerar ficam explícitas, permitindo que o chamador implemente o tratamento adequado.

Além disso, é possível lançar uma exceção diretamente dentro de um método usando o comando `throw`. O exemplo abaixo valida se o valor a ser depositado é maior que zero. Caso contrário, lança uma `IllegalArgumentException`:

```
public void depositar(double valor) {
    if (valor < 0) {
        throw new IllegalArgumentException("Valor de depósito inválido");
    }
    saldo += valor;
}
```

Neste caso, a exceção é `unchecked`, portanto, não é necessário incluir `throws` na assinatura do método. Já para exceções `checked`, é obrigatório declarar `throws`. Por exemplo:

```
public void sacar(double valor) throws Exception {
    if (valor > saldo) {
        throw new Exception("Saldo insuficiente");
    }
    saldo -= valor;
}
```

Esse método verifica se o saldo é suficiente para o saque. Caso não seja, lança uma exceção, obrigando o chamador a tratar a exceção ou propagá-la. Dessa forma, o código fica mais robusto e resiliente a erros.