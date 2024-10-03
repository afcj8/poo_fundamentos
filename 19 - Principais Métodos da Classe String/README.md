# 19. Principais Métodos da Classe String

Compreender os recursos da classe `String` permite que desenvolvedores criem aplicações mais eficientes e confiáveis. A seguir, são apresentados os principais métodos da classe String em Java.

## 19.1. Método startsWith

O método `startsWith` permite verificar se uma string começa com uma sequência específica de caracteres. Ele recebe como argumento a sequência a ser verificada.

```
public class MetodoStartsWith {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        if (nome.startsWith("Antônio")) {
            System.out.println("A String começa com Antônio");
        } else {
            System.out.println("A String não começa com Antônio");
        }
    }
}
```

No exemplo acima, o resultado será "A String começa com Antônio". Por padrão, o Java diferencia maiúsculas e minúsculas ao comparar strings. Apenas métodos como `equalsIgnoreCase` ignoram essa distinção, enquanto métodos como `startsWith` consideram as diferenças entre letras maiúsculas e minúsculas.

## 19.2. Método endsWith

O método `endsWith` verifica se uma string termina com uma sequência específica de caracteres. Ele recebe como argumento a sequência a ser verificada.

```
public class MetodoEndsWith {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        if (nome.endsWith("or")) {
            System.out.println("A String termina com 'or'");
        } else {
            System.out.println("A String não termina com 'or'");
        }
    }
}
```

No exemplo acima, o resultado será "A String termina com 'or'". Assim como o método `startsWith`, o `endsWith` também diferencia maiúsculas de minúsculas durante a comparação.

## 19.3. Método length

Assim como é possível recuperar o tamanho de um vetor, também é possível obter a quantidade de caracteres de uma string utilizando o método `length()`. No caso das strings, o `length` é um método e, portanto, deve ser chamado com parênteses.