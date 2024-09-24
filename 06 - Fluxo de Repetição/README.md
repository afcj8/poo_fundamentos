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