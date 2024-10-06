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