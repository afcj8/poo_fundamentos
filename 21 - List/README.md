# 21. List

A interface `List` em Java representa uma sequência ordenada de elementos e permite a inclusão de elementos repetidos. Dessa forma, os elementos em uma lista são organizados conforme a ordem de inserção. Ao contrário dos arrays, não é necessário definir o tamanho de uma lista ao criá-la, já que a lista pode se ajustar dinamicamente conforme novos elementos são inseridos ou removidos. Além disso, a interface `List` facilita a manipulação de seus elementos, permitindo ordenação e busca por valores específicos.

A interface `List` define as funcionalidades que as classes concretas devem implementar para manipular listas. A implementação mais comumente utilizada é a `ArrayList`. A tabela a seguir apresenta os principais métodos de uma lista:

| Método      | Descrição                                               |
| ----------- | ------------------------------------------------------- |
| add         | Adiciona um objeto em uma posição específica.           |
| get         | Retorna o objeto localizado em uma posição determinada. |
| remove      | Remove um objeto de uma posição específica.             |
| set         | Substitui um objeto em uma determinada posição.         |
| indexOf     | Retorna a posição de um objeto na lista.                |
| lastIndexOf | Retorna a última posição de um objeto na lista.         |
| sublist     | Retorna uma sublista a partir da lista original.        |

O `ArrayList` armazena seus elementos em um array interno, que cresce ou diminui dinamicamente conforme novos elementos são inseridos ou removidos. Embora o nome sugira uma relação direta com arrays, o `ArrayList` é uma implementação da interface `List` na API de coleções do Java e não permite acesso direto ao array interno, já que esse é encapsulado.

Para criar um `ArrayList`, basta utilizar seu construtor e importar a classe `ArrayList`, conforme o exemplo a seguir:

```
import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C#");
        System.out.println(lista);
    }
}
```

No exemplo acima, um `ArrayList` chamado `lista` é criado, e o método `add` é utilizado para inserir objetos ao final da lista. O resultado da execução do programa é: [Java, Python, C#].

## 21.1. Método set

O método `set` da classe `ArrayList` é utilizado para substituir um elemento em uma posição específica da lista. Quando necessário inserir um novo elemento em uma posição já ocupada, o método `set` permite que o novo valor substitua o elemento existente. Por exemplo, ao inserir um valor na primeira posição (índice 0), o elemento anterior é removido, e o novo valor ocupa seu lugar. O exemplo abaixo demonstra a utilização desse método:

```
import java.util.ArrayList;

public class MetodoSet {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.set(1, "C#");
        System.out.println(lista);
    }
}
```

No exemplo, após a execução, a lista contém dois elementos: "Java" na posição 0 e "C#" na posição 1, substituindo o valor "Python" que anteriormente ocupava essa posição.

## 21.2. Método remove

Para remover um elemento de uma lista, utiliza-se o método `remove`, que recebe como parâmetro a posição do elemento a ser excluído. Abaixo está um exemplo de uso:

```
import java.util.ArrayList;

public class MetodoRemove {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C#");
        lista.remove(0);
        System.out.println(lista);
    }
}
```

No exemplo, três elementos são adicionados à lista. Em seguida, o método `remove` é utilizado para excluir o elemento na posição 0. Após a remoção, a lista contém os valores "Python" e "C#".

## 21.3. Método get

O método `get` permite recuperar um elemento de uma lista com base em sua posição. Abaixo está um exemplo de uso:

```
import java.util.ArrayList;

public class MetodoGet {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C#");
        System.out.println(lista.get(2));
    }
}
```

No exemplo, três elementos são adicionados à lista. O método `get` é utilizado para obter o elemento na posição 2, que é "C#". Esse valor será impresso no console.

## 21.4. Percorrer

Uma lista pode ser percorrida de maneira semelhante a um array. No exemplo a seguir, percorre-se a lista e imprime-se o valor de cada elemento:

```
import java.util.ArrayList;

public class Percorrer {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C#");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
```

No exemplo, o método `size()` retorna a quantidade de elementos na lista, enquanto o laço `for` itera sobre cada posição da lista. O resultado da execução será a impressão dos valores "Java", "Python" e "C#".

## 21.5. Método indexOf

Para buscar um valor em um `ArrayList`, pode-se utilizar os métodos `indexOf` ou `lastIndexOf`, que funcionam de maneira semelhante aos métodos da classe `String`.