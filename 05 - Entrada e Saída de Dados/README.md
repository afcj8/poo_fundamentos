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