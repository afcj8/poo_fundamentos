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

```
public class MetodoLength {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        int caracteres = nome.length();
        System.out.println("A String possui " + caracteres + " caracteres");
    }
}
```

O resultado da execução será: "A String possui 14 caracteres".

## 19.4. Método charAt

Também é possível recuperar um caractere específico de uma string com base em sua posição. Essa funcionalidade é semelhante à de um vetor, onde se pode acessar um elemento pelo seu índice. Assim como em vetores, o primeiro caractere de uma string está na posição zero (0). O método utilizado para obter um caractere de uma string é o `charAt()`, que recebe como argumento a posição do caractere desejado.

```
public class MetodoCharAt {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        char caractere = nome.charAt(1);
        System.out.println("O segundo caractere da String é: " + caractere);
    }
}
```

No exemplo acima, o segundo caractere da string (índice 1) é recuperado e impresso no console. O resultado será: "O segundo caractere da String é: n".

## 19.5. Método indexOf

Outro método útil da classe String é o `indexOf()`. Ele permite localizar a primeira ocorrência de um caractere ou sequência de caracteres em uma string. Se o caractere ou palavra for encontrado, o método retorna a posição (índice) da primeira ocorrência. Caso contrário, o valor -1 é retornado, indicando que a string não contém o valor procurado. No exemplo abaixo:

```
public class MetodoIndexOf {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        int indice  = nome.indexOf("t");
        System.out.println("O índice do caractere 't' é: " + indice);
    }
}
```

Neste exemplo, o código busca a primeira ocorrência do caractere "t". O resultado da execução será: "O índice do caractere 't' é: 2", caso o caractere não seja encontrado na string, o método retornará -1.

Lembre-se de que os índices em uma string começam em zero e que os espaços em branco também são contabilizados.

O método `indexOf` também pode ser utilizado para procurar uma sequência de caracteres em uma string. Para isso, basta passar a palavra desejada em vez de um caractere individual.

```
public class MetodoIndexOf {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        int indicePalavra = nome.indexOf("Junior");
        System.out.println("O índice da palavra \"Junior\" é: " + indicePalavra);
    }
}
```

No exemplo acima, a variável `indicePalavra` armazena o valor do índice referente ao início da palavra "Junior" na string "Antônio Junior". O resultado da execução será o índice onde a palavra começa: "O índice da palavra "Junior" é: 8".

## 19.6. Método latsIndexOf

O método `lastIndexOf` da classe `String` é similar ao `indexOf`, mas em vez de retornar a posição da primeira ocorrência de um caractere ou palavra, ele retorna o índice da última ocorrência.