# 26. Captura e Tratamento de Exceções

Para lidar com exceções (checked ou unchecked) em tempo de execução, é necessário capturá-las e tratá-las adequadamente. O Java oferece duas estruturas essenciais para o tratamento de exceções: `try-catch` e `try-catch-finally`. Essas estruturas ajudam a separar o código principal das rotinas de tratamento de erros, conforme demonstrado abaixo:

```
try {
    // código
} catch (excecao) {
    // tratamento da exceção
}
```

No bloco `try`, são inseridos os trechos de código que podem gerar exceções, permitindo que a JVM monitore sua execução. Caso um erro ocorra, o fluxo é direcionado para o bloco `catch` correspondente, onde a exceção é tratada. O uso do `try` indica que o código está executando uma operação que pode gerar erros.

O bloco `catch` é acionado apenas se uma exceção for lançada dentro do bloco `try`. Se nenhuma exceção for gerada, o fluxo ignora o bloco `catch` e segue normalmente. Em caso de exceção, o `try` é interrompido, e a execução busca o bloco `catch` adequado para tratar a situação. Após o tratamento, o fluxo continua a partir da instrução seguinte ao último `catch`.

É possível utilizar múltiplos blocos `catch` para capturar diferentes tipos de exceções:

```
try {
    // código
} catch (Excecao1 e) {
    // tratamento da Excecao1
} catch (Excecao2 e) {
    // tratamento da Excecao2
} catch (Excecao3 e) {
    // tratamento da Excecao3
}
```

Nesse formato, apenas o primeiro `catch` compatível com o tipo de exceção lançada será executado. A ordem dos blocos `catch` é importante, pois o tratamento é feito de cima para baixo. Por isso, exceções mais específicas devem ser capturadas antes das mais genéricas.

A classe `Exception` é a exceção mais abrangente no Java, pois todas as outras exceções derivam dela. Portanto, a captura de `Exception` deve sempre ser colocada no último bloco `catch`, garantindo que exceções mais específicas sejam tratadas adequadamente antes dela.

Se nenhum bloco `catch` conseguir capturar a exceção lançada, o erro não será tratado, resultando na interrupção do programa como se não houvesse um bloco `try-catch`. Segue um exemplo que realiza a divisão de dois números inteiros:

```
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        int divisao = n1 / n2;
        System.out.println("O resultado é: " + divisao);
        sc.close();
    }
}
```

Esse código é simples, mas pode lançar uma exceção se o segundo número informado for zero. Nesse caso, ocorrerá uma `ArithmeticException`, já que a divisão por zero é uma operação inválida. Como essa é uma exceção unchecked, seu tratamento não é obrigatório. Abaixo, é apresentada uma versão modificada que inclui o tratamento de exceções:

```
import java.util.Scanner;

public class DivisaoTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        try {
            int divisao = n1 / n2;
            System.out.println("O resultado é: " + divisao);
        } catch (ArithmeticException e) {
            System.err.println("Erro ao dividir");
        }
        sc.close();
    }
}
```

Nesse exemplo, um bloco `try-catch` foi adicionado para capturar a `ArithmeticException` caso o divisor seja zero. Assim, ao invés de o programa ser interrompido, o fluxo de execução é redirecionado para o bloco `catch`, onde uma mensagem de erro é exibida. Se o divisor for zero, o resultado será "Erro ao dividir", e o bloco que imprime o resultado da divisão não será executado. Se o programa for executado sem que ocorra uma exceção, o resultado é exibido e o bloco `catch` é ignorado.

O bloco `catch` recupera a exceção gerada por meio do parâmetro, que, no exemplo acima, é identificado como `e`. Isso permite acessar detalhes específicos sobre a exceção e tratá-la de forma adequada.

A classe `Throwable` fornece métodos úteis para exibir informações sobre erros gerados. Por herança, a exceção `ArithmeticException` também possui esses métodos:

- `printStackTrace()`: imprime a pilha de execução que mostra onde a exceção foi gerada, incluindo o número da linha e a classe.
- `getMessage()`: retorna uma mensagem descritiva do erro ocorrido.

A seguir, é mostrado um exemplo de uso desses métodos para capturar e exibir detalhes de uma `ArrayIndexOutOfBoundsException`:

```
public class ExemploStackTrace {
    public static void main(String[] args) {
        int[] array = new int[2];
        try {
            array[2] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Mensagem de erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```

Nesse exemplo, a exceção ocorre ao acessar uma posição inválida no array. No bloco `catch`, são utilizados os métodos `getMessage()` e `printStackTrace()` para exibir o erro.