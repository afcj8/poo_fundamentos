# 3. Operadores

Operadores são símbolos especiais usados para realizar operações matemáticas, atribuições de valores e comparações lógicas.

## 3.1. Operadores Aritméticos

Os operadores aritméticos são utilizados para realizar operações básicas como soma, subtração, multiplicação e divisão. Além desses, há o operador de módulo, que retorna o resto da divisão entre dois números. A tabela a seguir apresenta os cinco principais operadores aritméticos:

| Operação      | Operador | Exemplo           |
| ------------- | -------- | ----------------- |
| Adição        |     +    | 5 + 3 = 8         |
| Subtração     |     -    | 8 - 3 = 5         |
| Divisão       |     /    | 10 / 3 = 3.333... |
| Multiplicação |     *    | 5 * 3 = 15        |
| Resto da div. |     %    | 10 % 3 = 1        |

No Java, a divisão entre números inteiros resulta em um valor inteiro, onde a parte fracionária é descartada sem arredondamento. Por exemplo, o resultado de `7 / 2` é `3`. O operador de módulo `%` retorna o resto da divisão, logo, `7 % 2` resulta em `1`.

Assim como em expressões matemáticas, Java permite a realização de múltiplas operações aritméticas em uma única expressão. As regras de precedência de operadores matemáticos também se aplicam no Java:

- Operações de multiplicação, divisão e módulo são realizadas primeiro, pois possuem o mesmo nível de precedência. Quando há mais de uma dessas operações na expressão, elas são resolvidas da esquerda para a direita.

- Em seguida, as operações de adição e subtração são aplicadas, também com o mesmo nível de precedência.

Parênteses podem ser utilizados para agrupar e priorizar operações, tal como nas expressões algébricas. Por exemplo, para calcular a soma de `x` e `y` antes de multiplicar por `z`, utiliza-se a seguinte expressão:

```
(x + y) * z
```

Nesse caso, a soma `x + y` é realizada primeiro.

## 3.2. Operadores de Atribuição


Aqui está uma versão aprimorada e mais fluida do seu texto:

Como já mencionado, a atribuição de valores a uma variável é feita utilizando o símbolo de igual `=`. A atribuição ocorre sempre após o processamento das expressões do lado direito. Por exemplo:

```
int x = 10;
x = x + 15;
```

Qual é o valor final de `x`? Primeiro, a variável `x` é inicializada com o valor `10`. Em seguida, a expressão `x + 15` é processada, retornando o valor `25`. Após isso, esse valor é atribuído de volta à variável `x`.


Aqui está uma versão aprimorada e mais fluida do seu texto:

Como já mencionado, a atribuição de valores a uma variável é feita utilizando o símbolo de igual =. A atribuição ocorre sempre após o processamento das expressões do lado direito. Por exemplo:

java
Copiar código
int x = 10;
x = x + 15;
Qual é o valor final de x? Primeiro, a variável x é inicializada com o valor 10. Em seguida, a expressão x + 15 é processada, retornando o valor 25. Após isso, esse valor é atribuído de volta à variável x.

Para simplificar essa operação, que é bastante comum na programação, existem operadores específicos de atribuição. Assim, o código pode ser reescrito da seguinte forma:

```
int x = 10;
x += 15;
```

Os outros operadores aritméticos básicos — multiplicação, divisão e subtração — também possuem seus respectivos operadores de atribuição. A tabela abaixo apresenta os operadores de atribuição e suas expressões equivalentes:

| Expresão      | Significado |
| ------------- | ----------- |
| x += y        | x = x + y   |
| x -= y        | x = x - y   |
| x *= y        | x = x * y   |
| x /= y	    | x = x / y   |

Esses operadores tornam o código mais conciso e legível.

## 3.3. Operadores de Incremento e Decremento

Para aumentar ou diminuir o valor de uma variável em uma unidade, podem ser utilizados os operadores de incremento `++` e decremento `--`.

Por exemplo, para adicionar 1 à variável `x`, pode-se utilizar `x++;`, que é equivalente à expressão `x = x + 1;`. Da mesma forma, para subtrair `1` de `x`, pode-se escrever `x--;`, equivalente `a x = x - 1;`. O código abaixo ilustra o uso desses operadores:

```
public class Operadores {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a); // 11
        a--;
        System.out.println(a); // 10
    }
}
```

Ao executar esse código, os valores impressos serão 11 e 10, respectivamente. Primeiro, a variável `a` é incrementada em 1, resultando em 11. Em seguida, ela é decrementada em 1, retornando ao valor original de 10.

## 3.4. Operadores Relacionais

Para realizar comparações entre variáveis, valores ou outros tipos de informações, são utilizados operadores que formam expressões lógicas, as quais retornam um valor booleano: verdadeiro (`true`) ou falso (`false`). A tabela a seguir apresenta os operadores de comparação disponíveis no Java:

| Operação    | Símbolo  | Exemplo           |
| ----------- | -------- | ----------------- |
| Igual       |    ==    | 5 == 3 --> False  |
| Diferente   |    !=    | 8 != 3 --> True   |
| Maior       |    >     | 10 > 3 --> True   |
| Maior-igual |    >=    | 5 >= 5 --> True   |
| Menor       |    <     | 5 < 2 --> False   |
| Menor-igual |    <=    | 10 <= 3 --> False |

Por exemplo, no código a seguir:

```
int idade = 10;
boolean maioridade = idade > 18;
```

A variável `idade` é inicializada com o valor 10. Em seguida, a variável booleana `maioridade` recebe o resultado da expressão `idade > 18`, que verifica se o valor de `idade` é maior que 18. Nesse caso, o resultado será `false`.

## 3.5. Operadores Lógicos

Operadores lógicos são utilizados para formar expressões de comparação mais complexas, envolvendo mais de um termo. Essas expressões retornam valores booleanos (verdadeiro ou falso). Os operadores lógicos mais comuns são: AND, OR, XOR e NOT.

### 3.5.1. Operação AND (&&)

O operador lógico AND (e) é representado por `&&`. Quando duas expressões são combinadas com `&&`, o resultado final será `true` somente se ambas as expressões forem verdadeiras. Exemplo:

```
boolean precisaVotar = idade > 18 && idade < 70;
```

No exemplo acima, a primeira expressão verifica se `idade` é maior que 18, e a segunda, se `idade` é menor que 70. A variável `precisaVotar` receberá `true` somente se ambas as condições forem verdadeiras; caso contrário, será `false`. A tabela a seguir ilustra a operação AND:

| a | b | a and b |
| - | - | ------- |
| v | v | v       |
| v | f | f       |
| f | v | f       |
| f | f | f       |