# 18. Comparação de Strings

A comparação de strings em Java deve ser realizada utilizando métodos específicos, uma vez que o operador `==` compara referências de memória e não o conteúdo das strings. Os principais métodos para a comparação de strings são:

- `equals(String)`: verifica se o valor das strings é idêntico.
- `equalsIgnoreCase(String)`: compara as strings sem diferenciar entre letras maiúsculas e minúsculas.

O uso do operador `==` para comparar strings não é recomendado, pois ele compara apenas os endereços de memória onde as variáveis estão armazenadas, e não o valor em si. Veja o exemplo a seguir:

```
public class Comparacao {
    public static void main(String[] args) {
        String nome1 = new String("Antônio");
        String nome2 = new String("Antônio");
        if (nome1 == nome2) {
            System.out.println("As Strings são iguais!");
        } else {
            System.out.println("As Strings são diferentes!");
        }
    }
}
```

Embora as variáveis `nome1` e `nome2` tenham o mesmo valor, elas estão alocadas em diferentes endereços de memória, resultando na mensagem "As Strings são diferentes!", já que o operador `==` está comparando os endereços de memória.

No entanto, se as strings forem inicializadas sem instanciá-las explicitamente com o operador `new`, elas serão armazenadas no pool de strings. Neste caso, se os valores forem iguais, as strings compartilharão o mesmo espaço de memória, permitindo que o operador `==` funcione corretamente:

```
public class Comparacao {
    public static void main(String[] args) {
        String nome1 = "Antônio";
        String nome2 = "Antônio";
        if (nome1 == nome2) {
            System.out.println("As Strings são iguais!");
        } else {
            System.out.println("As Strings são diferentes!");
        }
    }
}
```

Neste exemplo, o resultado será "As Strings são iguais!", porque `nome1` e `nome2` estão compartilhando o mesmo endereço de memória no pool de strings.

Porém, se uma das variáveis for instanciada utilizando o operador `new`, o operador `==` não funcionará como esperado. O exemplo abaixo resulta em "As Strings são diferentes!":

```
public class Comparacao {
    public static void main(String[] args) {
        String nome1 = "Antônio";
        String nome2 = new String("Antônio");
        if (nome1 == nome2) {
            System.out.println("As Strings são iguais!");
        } else {
            System.out.println("As Strings são diferentes!");
        }
    }
}
```

Portanto, recomenda-se sempre utilizar os métodos `equals()` ou `equalsIgnoreCase()` para comparar strings, pois eles garantem a comparação correta, independentemente da forma como as variáveis foram inicializadas.

## 18.1. Método equals()

O método `equals()` compara o conteúdo de duas strings, diferenciando letras maiúsculas de minúsculas. Assim, a string "Antônio" é considerada diferente de "antônio". No exemplo a seguir, o conteúdo das variáveis `nome1` e `nome2` é comparado, e a mensagem "As Strings são iguais!" será exibida no console, pois os valores são idênticos:

```
public class MetodoEquals {
    public static void main(String[] args) {
        String nome1 = "Antônio";
        String nome2 = new String("Antônio");
        if (nome1.equals(nome2)) {
            System.out.println("As Strings são iguais!");
        } else {
            System.out.println("As Strings são diferentes!");
        }
    }
}
```

Para verificar se as strings são diferentes, é possível utilizar o operador de negação `!` junto ao método `equals()`. Dessa forma, a condição será invertida, verificando se as strings não são iguais. O exemplo abaixo ilustra essa abordagem:

```
public class MetodoEquals {
    public static void main(String[] args) {
        String nome1 = "Antônio";
        String nome2 = new String("Antônio");
        if (!nome1.equals(nome2)) { 
            System.out.println("As Strings são diferentes!");
        } else {
            System.out.println("As Strings são iguais!");
        }
    }
}
```

Neste caso, se as strings forem diferentes, a mensagem "As Strings são diferentes!" será exibida.

## 18.2. Método equalsIgnoreCase()

O método `equalsIgnoreCase()` compara o conteúdo de duas strings sem diferenciar entre caracteres maiúsculos e minúsculos. Assim, a string "Antônio" é considerada igual à string "antônio". O exemplo a seguir ilustra a utilização desse método:

```
public class MetodoEqualsIgnoreCase {
    public static void main(String[] args) {
        String nome1 = "antônio";
        String nome2 = new String("Antônio");
        if (nome1.equalsIgnoreCase(nome2)) { 
            System.out.println("As Strings são iguais!");
        } else {
            System.out.println("As Strings são diferentes!");
        }
    }
}
```

No exemplo acima, o resultado será "As Strings são iguais!", uma vez que o método ignora a diferença entre maiúsculas e minúsculas.

O operador de negação `!` também pode ser utilizado com o método `equalsIgnoreCase()` para verificar se as strings são diferentes, independentemente da capitalização dos caracteres.