# 34. Enums

A palavra enum é uma abreviação de “enumeração”, e é usada em programação para se referir a um tipo de dado que permite definir um conjunto fixo de valores nomeados. Em Java, um enum é uma classe especial que contém um conjunto fixo de constantes nomeadas. Os enums são úteis para representar um conjunto de valores fixos e bem definidos em um programa, como os dias da semana, os meses do ano ou os códigos de erro.

Em Java, pode-se definir um enum, como se fosse definir uma classe, porém trocando a palavra-chave `class` por `enum`. A sintaxe básica para definir um enum é a seguinte:

```
enum NomeDoEnum {
    ATRIBUTO1, ATRIBUTO2
}
```

Por se tratarem de constantes, é uma convenção que os nomes dos atributos de um enum sejam nomeados utilizando apenas letras maiúsculas e o símbolo de underline (`_`), nos casos onde o nome do atributo é composto por múltiplas palavras. Embora esse tipo de nomenclatura não tenha nenhum impacto do ponto de vista do funcionamento desse tipo de dados, essa convenção é considerada uma boa prática e é amplamente usada pela comunidade. Aqui está um exemplo simples de enum que define os dias da semana:

```
enum DiaDaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}
```

## 34.1. Manipulação de Enums

No Java, há várias maneiras de manipular enums, que são tipos específicos usados para representar um conjunto fixo de constantes. Abaixo estão algumas formas de interagir com enums:

1. **Acessar atributos de um enum:** Atributos de um enum podem ser acessados diretamente usando a sintaxe `NomeDoEnum.ATRIBUTO`. Por exemplo, para acessar o atributo `SEGUNDA` do enum `DiaDaSemana`, usa-se:

```
DiaDaSemana dia = DiaDaSemana.SEGUNDA;
```

2. **Comparar atributos de um enum:** É possível comparar atributos de um enum usando o operador de igualdade (`==)` ou o método `equals()`. Para verificar se um objeto `DiaDaSemana` corresponde à constante `SEGUNDA`, o seguinte código pode ser usado:

```
public class TesteEnum {
    public static void main(String[] args) {
        DiaDaSemana hoje = DiaDaSemana.QUARTA;
        if (hoje == DiaDaSemana.SEGUNDA) {
            System.out.println("Hoje é SEGUNDA");
        } else {
            System.out.println("Hoje não é SEGUNDA");
        }
    }
}
```

3. **Obter todos os atributos de um enum:** Para obter e iterar sobre todos os valores de um enum, o método `values()` pode ser utilizado em conjunto com um loop. Por exemplo, para imprimir todos os dias do enum `DiaDaSemana`:

```
public class TesteEnum {
    public static void main(String[] args) {
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia);
        }
    }
}
```

Essas operações ajudam a aproveitar a simplicidade e segurança dos enums, facilitando o uso de conjuntos fixos de valores, como dias da semana, meses do ano, ou outros tipos de categorias pré-definidas.