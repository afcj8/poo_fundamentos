# 5. Entrada e Saída de Dados

No Java, a exibição de informações pode ser feita com a instrução `System.out.println();`, que inclui uma quebra de linha após imprimir o conteúdo. Já a instrução `System.out.print();` imprime o conteúdo sem pular uma linha ao final, continuando na mesma linha.

Para ler dados inseridos pelo usuário, utiliza-se a classe `Scanner`, que permite capturar diferentes tipos de entrada, como dados digitados no teclado. A seguir, um exemplo de como declarar um objeto `Scanner` para esse fim:

```
Scanner sc = new Scanner(System.in);
```

Nesse código, cria-se uma variável `sc` do tipo `Scanner`. O `System.in` indica que os dados a serem lidos virão da entrada padrão (geralmente, o teclado).

## 5.1. Métodos da Classe Scanner

Após a criação do objeto `Scanner`, é possível usar seus métodos para ler diferentes tipos de dados:

- `sc.nextInt();` para ler um número inteiro.
- `sc.nextDouble();` para ler um número decimal.

Por exemplo:

```
Scanner sc = new Scanner(System.in);
int idade = sc.nextInt();
double preco = sc.nextDouble();
```

## 5.2. Importação da Classe Scanner

A classe `Scanner` faz parte do pacote `java.util`. Quando se utiliza classes de pacotes fora do pacote básico `java.lang`, é necessário importá-las no início do código com a instrução import. Veja o exemplo abaixo:

```
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Criação do Scanner
        int idade = sc.nextInt(); // Leitura de um número inteiro
        System.out.println("Idade digitada: " + idade); // Exibição do valor lido
        sc.close(); // Fechamento do Scanner
    }
}
```

A instrução `import java.util.Scanner;`, na linha 1, importa a classe `Scanner` do pacote `java.util`. Na linha 6, o método `nextInt()` é utilizado para ler um número inteiro inserido pelo usuário. Em seguida, o valor da variável `idade` é exibido na linha 7 com o uso do `System.out.println()`. Finalmente, na linha 8, o método `sc.close();` é chamado para fechar o `Scanner`, liberando os recursos utilizados.

Lembrando que sempre que utilizar classes fora do pacote padrão, é necessário fazer sua importação.