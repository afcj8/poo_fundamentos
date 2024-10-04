# 23. Map

Mapas são estruturas úteis quando se deseja armazenar informações de forma que possam ser recuperadas rapidamente por meio de uma chave. Um exemplo seria armazenar objetos da classe Aluno em um mapa, utilizando o RM como chave. Assim, ao fornecer o RM, é possível recuperar todas as informações do aluno associado. Embora listas possam ser usadas para esse propósito, seria necessário percorrer todos os elementos para encontrar o aluno correto, o que comprometeria a performance, mesmo em listas pequenas.  

Um mapa é composto por pares de chave e valor, onde as chaves são únicas, mas os valores podem ser duplicados. A principal implementação da interface `Map` é a classe `HashMap`. A tabela a seguir descreve os métodos mais importantes da interface `Map`:

| Método        | Descrição                                          |
| ------------- | -------------------------------------------------- |
| clear         | Remove todos os mapeamentos.                       |
| containsKey   | Verifica se uma chave está presente no mapeamento. |
| containsValue | Verifica se um valor está presente no mapeamento.  |
| get           | Retorna o valor associado a uma chave específica.  |
| isEmpty       | Verifica se o mapeamento está vazio.               |
| keySet        | Retorna um conjunto contendo as chaves.            |
| put           | Adiciona um mapeamento de chave e valor.           |
| remove        | Remove um mapeamento.                              |
| size          | Retorna o número de mapeamentos.                   |
| values        | Retorna uma coleção com todos os valores.          |

O método `put` é utilizado para adicionar elementos a um mapa, recebendo como parâmetros a chave e o valor. Abaixo está um exemplo de uso:

```
import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("RM1234", "Antônio");
        mapa.put("RM4321", "José");
        System.out.println(mapa);
    }
}
```

Nesse exemplo, o mapa armazena os pares RM e nome do aluno, onde o RM é a chave e o nome é o valor. O resultado da execução será: {RM4321=José, RM1234=Antônio}.

Para recuperar um valor do mapa, utiliza-se o método `get`, passando a chave correspondente:

```
System.out.println(mapa.get("RM1234"));
```

Esse código imprimirá "Antônio" no console.

O método `remove` é utilizado para excluir um mapeamento do mapa, como mostrado no exemplo a seguir:

```
import java.util.HashMap;

public class HashMapRemove {
    public static void main(String[] args) {
       HashMap<String, String> mapa = new HashMap<>();
        mapa.put("RM1234", "Antônio");
        mapa.put("RM4321", "José");
        mapa.remove("RM4321");
        System.out.println(mapa);
    }
}
```

Após a remoção do elemento com a chave "RM4321", o mapa conterá apenas {RM1234=Antônio}. Se tentar recuperar o valor associado à chave removida, o método `get` retornará `null`.