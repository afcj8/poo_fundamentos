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