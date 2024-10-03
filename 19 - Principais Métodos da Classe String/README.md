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

## 19.6. Método lastIndexOf

O método `lastIndexOf` da classe `String` é similar ao `indexOf`, mas em vez de retornar a posição da primeira ocorrência de um caractere ou palavra, ele retorna o índice da última ocorrência. No exemplo a seguir, o método busca a última ocorrência do caractere 'o':

```
public class MetodoLastIndexOf {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        int indice = nome.lastIndexOf("o");
        System.out.println("O índice do último caractere 'o' é: " + indice);
    }
}
```

Nesse caso, a posição retornada será o índice da última ocorrência do caractere 'o'. Para buscar uma palavra, basta passá-la como parâmetro, e o método retornará o índice da última ocorrência dessa sequência de caracteres.

## 19.7. Método substring

O método `substring` permite criar uma nova string a partir de um trecho de uma string existente. Ele recebe como parâmetros a posição inicial (inclusiva) e a posição final (exclusiva) dos caracteres a serem copiados. O caractere na posição inicial é incluído na nova string, enquanto o caractere na posição final é excluído. No exemplo a seguir, o método cria uma nova string a partir do índice 8 até o 14:

```
public class MetodoSubstring {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        String nova = nome.substring(8, 14);
        System.out.println("A nova String é: " + nova);
    }
}
```

No exemplo acima, o resultado será a string "Junior", correspondente aos caracteres da posição 8 até 14 da string original.

O método `substring` também pode ser utilizado passando apenas a posição inicial, e, nesse caso, a nova string será formada a partir dessa posição até o final da string original.

## 19.8. Métodos toUpperCase e toLowerCase

É possível converter os caracteres de uma string para maiúsculas ou minúsculas utilizando os métodos `toUpperCase` e `toLowerCase` da classe `String`. O método `toUpperCase` transforma todos os caracteres em maiúsculas, enquanto o método `toLowerCase` converte para minúsculas. É importante lembrar que as strings em Java são imutáveis, ou seja, não podem ser alteradas. Dessa forma, ao utilizar esses métodos, uma nova string é criada com as alterações solicitadas. O exemplo abaixo demonstra a utilização do método `toUpperCase`:

```
public class MetodoToUpperCase {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        String nova = nome.toUpperCase();
        System.out.println("A nova String é: " + nova);
    }
}
```

O resultado da execução será uma nova string com todos os caracteres convertidos para maiúsculas. O mesmo conceito se aplica ao método `toLowerCase`, que cria uma nova string com os caracteres em minúsculas, sem modificar a string original.

## 19.9. Método replace

É possível substituir caracteres ou palavras em uma string utilizando o método `replace`. Esse método recebe como parâmetros o caractere ou palavra a ser substituído e o novo caractere ou palavra que irá substituí-los, criando uma nova string com a modificação. No exemplo a seguir, todos os caracteres 'n' são substituídos por 'x':

```
public class MetodoReplace {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        String nova = nome.replace('n', 'x');
        System.out.println("A nova String é: " + nova);
    }
}
```

No exemplo acima, o caractere 'n' é substituído pelo caractere 'x', e o resultado é armazenado na variável `nova`. A string original, armazenada na variável `nome`, permanece inalterada.

Além disso, também é possível substituir uma palavra inteira em uma string, seguindo a mesma lógica.

## 19.10. Método split

O método `split` é uma ferramenta poderosa da classe `String` que permite dividir uma string em várias partes, com base em um delimitador especificado. Esse delimitador pode ser qualquer caractere ou sequência de caracteres. No exemplo a seguir, o espaço em branco é utilizado como delimitador:

```
public class MetodoSplit {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        String[] palavras = nome.split(" ");
        for (String p : palavras) {
            System.out.println(p);
        }
    }
}
```

Nesse exemplo, a string armazenada na variável `nome` é dividida em várias palavras, separadas pelo espaço em branco. O resultado é armazenado em um array de strings, e um laço `for` percorre esse array, imprimindo cada elemento. Além do espaço em branco, é possível utilizar qualquer outro caractere ou sequência de caracteres como delimitador para separar a string.