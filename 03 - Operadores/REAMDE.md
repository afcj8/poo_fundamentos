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