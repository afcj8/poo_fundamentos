# 7. Arrays

Um array é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo, que pode ser um tipo primitivo ou um objeto. Cada elemento dentro do array possui um índice numérico, utilizado para acessar e manipular os dados. O índice começa em 0, ou seja, o primeiro elemento do array é acessado com o índice 0, o segundo com o índice 1, e assim por diante. O comprimento do array é fixo, ou seja, uma vez definido, não pode ser alterado. O atributo `length` permite recuperar o tamanho do array, como ilustrado na Figura 7.1, que mostra um array com 10 posições e seus índices correspondentes.

<div align="center">
    <img src="../imgs/array.png" width="50%"/>
    <p>Figura 7.1: Array com 10 posições.</p>
</div>

Em Java, um array é um objeto e, portanto, pode-se utilizar o operador `new` para criar uma nova instância de um array. Para declarar uma variável que armazena um array, é necessário especificar o tipo do array, seguido de colchetes `[]` e o nome da variável. Exemplo:

```
int[] notas;
```

Neste caso, a variável `notas` é declarada para armazenar um conjunto de números inteiros. Também é possível colocar os colchetes após o nome da variável, como no exemplo a seguir:

```
int notas[];
```

Ambas as formas produzem o mesmo resultado. Após a declaração, o array pode ser inicializado com o operador `new`:

```
int[] notas = new int[40];
```

Ao declarar um array, é necessário definir seu comprimento nos colchetes. No exemplo acima, cria-se um array com capacidade para armazenar 40 números inteiros. Em arrays de números, os elementos são inicializados com `0`, em arrays de booleanos com `false`, e em arrays de objetos com `null`.

Para atribuir um valor a uma posição específica no array, utiliza-se o índice correspondente nos colchetes:

```
notas[0] = 10;
```

Para acessar um valor armazenado no array, basta referenciar o índice:

```
System.out.println(notas[0]);
```

No exemplo acima, o valor armazenado no índice 0 é recuperado e exibido no console.

Há duas maneiras de declarar e inicializar um array com valores predeterminados. A primeira consiste em utilizar chaves `{}` com os valores separados por vírgulas:

```
int[] notas = {10, 9, 8, 2};
```

A segunda forma é semelhante, mas inclui o operador `new`:

```
int[] notas = new int[] {10, 9, 8, 2};
```

Essas duas abordagens produzem o mesmo resultado que o código abaixo:

```
int[] notas = new int[4];
notas[0] = 10;
notas[1] = 9;
notas[2] = 8;
notas[3] = 2;
```

Arrays em Java podem ser criados com qualquer tipo de dado, seja ele primitivo ou uma classe Java:

```
byte[] bytes = new byte[4];
short[] shorts = new short[5];
double[] doubles = new double[8];
float[] floats = new float[2];
String[] strings = new String[10];
Conta[] contas = new Conta[3];
```

Para acessar todas as posições de um array, os loops são uma ferramenta adequada, pois permitem percorrer todas as posições de forma sequencial, com a quantidade de iterações sendo igual ao tamanho do array. Por exemplo, para armazenar as notas de uma turma de 10 alunos e calcular sua média, pode-se utilizar um loop para ler as notas e, em seguida, calcular e exibir a média.

No exemplo apresentado, o scanner é instanciado para realizar a leitura do teclado. Em seguida, cria-se um array de `float` com 10 posições. Utiliza-se a estrutura de repetição `for` para ler e armazenar as notas dos alunos em cada posição do array.

```
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[10];
        for (int i = 0; i < 10; i++) {
            System.err.print("Digite a nota do aluno: ");
            notas[i] = sc.nextFloat();
        }
        sc.close();
    }
}
```

Observa-se que a variável `i` é utilizada como índice para controlar a posição do array que será preenchida. Na primeira iteração, o valor de `i` será 0, correspondente à primeira posição do array. Na última iteração, o valor de `i` será 9, que corresponde à última posição. Como os arrays em Java iniciam na posição 0, um array de 10 posições vai de 0 a 9.

É possível otimizar o código ao invés de fixar o valor 10 no `for`, utilizando o tamanho do array como critério de parada:

```
for (int i = 0; i < notas.length; i++)
```

A seguir, implementa-se a segunda parte do programa: calcular a média das notas. Para isso, utiliza-se outro loop para somar todas as notas e, em seguida, divide-se pela quantidade de notas.

```
float totalNotas = 0;
for (int i = 0; i < notas.length; i++) {
     totalNotas = totalNotas + notas[i];
}
float media = totalNotas / notas.length;
System.out.printf("A média das notas é: %.2f", media);
sc.close();
```

Primeiro, declara-se uma variável `totalNotas` do tipo `float` para armazenar a soma das notas. O loop percorre o array, somando as notas em `totalNotas`. Após somar, o total é dividido pela quantidade de alunos (`notas.length`) para calcular a média e exibir o resultado no console.

**Programa Completo:**

```
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[10];
        for (int i = 0; i < 10; i++) {
            System.err.print("Digite a nota do aluno: ");
            notas[i] = sc.nextFloat();
        }
        float totalNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            totalNotas = totalNotas + notas[i];
        }
        float media = totalNotas / notas.length;
        System.out.printf("A média das notas é: %.2f", media);
        sc.close();
    }
}
```
