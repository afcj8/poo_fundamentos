# 25. Exceptions (Exceções)

Uma exceção é um evento inesperado que ocorre durante a execução de um programa, conhecido como tempo de execução (runtime). Quando uma exceção é lançada, o fluxo normal do programa é interrompido.

## 25.1. Tratamento de Exceções

Durante a execução de um programa, é possível que exceções ou erros aconteçam. Tais problemas podem surgir por várias razões, como:

- Falha na aquisição de recursos: por exemplo, ao tentar abrir um arquivo, conectar-se a um banco de dados ou acessar um web service.
- Tentativa de realizar operações impossíveis: como a divisão de um número por zero ou o acesso a uma posição inexistente em um array.
- Condições inválidas: por exemplo, invocar um método de um objeto não instanciado ou realizar um cast inadequado.

Essas situações inesperadas, se não tratadas, interrompem o fluxo do programa. No entanto, o tratamento de exceções permite gerenciar esses erros sem prejudicar a continuidade do código. Por exemplo, em um programa que realiza uma divisão, caso o usuário forneça zero como divisor, o programa lançará uma exceção. Nesse caso, é possível tratar a exceção e solicitar ao usuário um novo valor, evitando que o programa seja interrompido.

O tratamento de exceções no Java ocorre em três passos principais:

1. **Lançamento:** Ocorre quando uma condição de erro inesperada é detectada.
2. **Captura:** Em algum ponto do código, a exceção é interceptada.
3. **Tratamento:** Após a captura, a exceção é tratada de forma adequada para manter a continuidade do programa.

Se uma exceção não for capturada, o programa é encerrado.

## 25.2. Classificação das Exceções

No Java, as exceções são representadas como objetos da classe `Exception`. Essas exceções podem ser divididas em três categorias principais:

- **Checked:** Exceções que devem ser obrigatoriamente tratadas ou relançadas pelo desenvolvedor. Elas herdam da classe `Exception`.
- **Unchecked:** Exceções opcionais de serem tratadas. Geralmente são causadas por erros no código. Se não forem tratadas, são automaticamente relançadas. Essas exceções herdam de `RuntimeException`.
- **Error:** Erros críticos que indicam problemas graves, sendo geralmente irreparáveis em tempo de execução. Esses erros são lançados pela JVM e indicam que o programa não pode continuar.

A tabela abaixo ilustra exemplos dessas classificações:

| Classe | Objetivo | Exemplo |
| ------ | -------- | ------- |
| Error  | Erro que não pode ser tratado na aplicação, indicando que o programa não pode continuar. | `OutOfMemoryError`: indica que não há memória suficiente para continuar a execução do programa. |
| Exception | Exceção que deve ser tratada pelo desenvolvedor. | `ArithmeticException`: ocorre em operações aritméticas inválidas, como a divisão por zero. |
| RuntimeException | Exceção que pode ser tratada, porém não é obrigatória. | `NullPointerException`: ocorre ao tentar acessar métodos ou atributos de um objeto não instanciado. |

Por meio do tratamento de exceções, é possível manter a estabilidade do programa e gerenciar erros de forma segura e controlada.