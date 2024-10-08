# 17. Strings

Uma String é uma sequência de caracteres, essencial para validações de dados de entrada, exibição de informações ao usuário e manipulação de textos em geral. O Java não possui um tipo de dado primitivo para armazenar strings, como ocorre com `int` ou `double`. Em vez disso, a linguagem utiliza a classe pré-definida `String` da sua biblioteca padrão.

Objetos `String` são imutáveis, ou seja, o conteúdo de caracteres não pode ser alterado após a inicialização. Isso significa que não é possível modificar uma `String` diretamente, mas é possível atribuir um novo valor a ela. Para declarar uma `String`, basta seguir o mesmo procedimento de outros tipos de dados:

```
String nome;
```

Após a declaração, a `String` pode ser instanciada como qualquer outro objeto. A sintaxe para instanciá-la é:

```
String nome = new String();
```

Também é possível inicializá-la diretamente ao declarar:

```
String nome = new String("Antônio");
```

Ou, de maneira mais simplificada:

```
String nome = "Antônio";
```

Nesse último exemplo, a `String` é armazenada em um pool de strings, uma área de cache utilizada pelo Java.

## 17.1. Atributos de Instância

Se uma `String` for um atributo de instância (variável de classe), ela precisa ser inicializada antes de seu uso. A falta de inicialização atribui automaticamente o valor `null`. Tentar acessar métodos de uma `String` com valor `null` resultará em uma `NullPointerException`. Por exemplo, o código a seguir gera um erro ao tentar acessar o método `length()` em uma variável não inicializada:

```
String nome = null;
System.out.println(nome.length());
```

Para evitar esse erro, a `String` deve ser inicializada antes do uso:

```
String nome = new String();
System.out.println(nome.length());
```

Ou, com uma inicialização direta:

```
String nome = "Antônio";
System.out.println(nome.length());
```

Quando uma variável é declarada dentro de um método, ela precisa ser inicializada antes de ser utilizada. Caso contrário, um erro de compilação será gerado:

```
String nome;
System.out.println(nome.length());
```

## 17.2. Sequências de Escape

Em Java, para imprimir ou armazenar certos caracteres especiais, como aspas duplas ou barras invertidas, utilizam-se sequências de escape, que são precedidas por uma contrabarra (`\`). A tabela a seguir mostra as sequências de escape mais comuns:

| Escape | Descrição |
| ------ | --------- |
| \n     | Quebra de linha, posiciona o cursor no início da próxima linha. |
| \t     | Tabulação horizontal, move o cursor para a próxima posição de tabulação. |
| \\     | Barras invertidas, usada para gerar uma barra invertida (\). |
| \"     | Aspas duplas, usada para gerar um caractere de aspas duplas ("). |
| \'     | Aspas simples, usada para gerar um caractere de aspas simples ('). |

Para utilizar uma sequência de escape, basta incluí-la dentro da string. O exemplo a seguir demonstra o uso da sequência `\n` para quebra de linha:

```
public class Teste {
    public static void main(String[] args) {
        String nome = "Antônio \nFernandes da Cruz Junior";
        System.out.println(nome);
    }
}
```

Nesse exemplo, o nome completo é impresso com uma quebra de linha entre o primeiro nome e o sobrenome.