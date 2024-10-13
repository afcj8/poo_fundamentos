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