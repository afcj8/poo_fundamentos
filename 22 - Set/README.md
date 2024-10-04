# 22. Set

A interface `Set` define uma coleção que não permite valores duplicados, correspondendo à abstração de um conjunto, semelhante aos conjuntos da matemática. Além disso, a ordem de inserção dos elementos nem sempre será mantida, podendo variar de acordo com a implementação. A interface `Set` contém apenas os métodos herdados da interface `Collection`.

Uma das principais implementações de `Set` é a classe `HashSet`, que armazena seus elementos em uma tabela hash, oferecendo simplicidade e eficiência. Abaixo está um exemplo de uso:

```
import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<String> cursos = new HashSet<>();
        cursos.add("Java");
        cursos.add(".NET");
        cursos.add("Android");
        cursos.add("Java");  // elemento repetido
        System.out.println(cursos);
    }
}
```

No exemplo acima, o segundo valor "Java" não será adicionado ao `HashSet`, já que conjuntos não permitem duplicatas. O resultado será: [Java, .NET, Android].

Uma das principais vantagens do `Set` é o desempenho nas operações de busca, utilizando o método `contains`, que é mais eficiente em comparação com as listas (`List`).