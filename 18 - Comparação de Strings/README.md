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