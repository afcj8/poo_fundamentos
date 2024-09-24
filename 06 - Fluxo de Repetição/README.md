# 6. Fluxo de Repetição

Fluxos de repetição, ou loops, permitem que um bloco de código seja executado repetidamente enquanto uma condição for verdadeira. No Java, existem três estruturas de repetição: `while`, `do-while` e `for`.

## 6.1. While

O loop `while` cria um laço que executa uma instrução (ou um conjunto de instruções) enquanto a condição de teste for avaliada como verdadeira. A estrutura básica é:

```
while (condição) {
     instrução;
}
```

Se a condição for verdadeira, a instrução é executada. Quando a condição for falsa, o loop é interrompido, e o fluxo do programa segue a próxima instrução. Vale ressaltar que o loop `while` não será executado se a condição inicial for falsa. A figura 6.1 a seguir mostra o fluxograma do laço while.

<div align="center">
    <img src="../imgs/while.png" width="50%" style="max-height: 120vh;"/>
    <p>Figura 6.1: Fluxograma (while).</p>
</div>

Por exemplo, o código a seguir imprime os números de 1 a 10:

```
public class While {
    public static void main(String[] args) {
        int numero = 0;
        while (numero < 10) {
            numero++;
            System.out.println(numero);
        }
    }
}
```

Nesse código, a variável `numero` é iniciada com o valor 0. A cada iteração, ela é incrementada em uma unidade e seu valor é exibido no console. Quando `numero` atinge 10, a condição do `while` se torna falsa e o loop é encerrado.

O teste da condição ocorre antes de cada iteração, o que significa que o loop pode não ser executado nenhuma vez se a condição for falsa desde o início. Para garantir que o bloco de código seja executado ao menos uma vez, o teste pode ser movido para o final do loop, utilizando a estrutura `do-while`.