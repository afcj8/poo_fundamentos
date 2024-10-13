# 32. Constantes

No Java, é comum utilizar os modificadores `public`, `static` e `final` ao declarar uma constante. Uma constante representa um valor fixo que não pode ser alterado após a sua definição. Os modificadores têm funções específicas para definir a acessibilidade e imutabilidade desses valores:

- `public`: permite que a constante seja acessível por outras classes.
- `static`: indica que a constante pertence à classe, e não a instâncias individuais, o que evita a criação de cópias para cada objeto.
- `final`: assegura que o valor da constante não possa ser alterado após a sua atribuição inicial, garantindo sua imutabilidade.

Por convenção, os nomes de constantes em Java são escritos em letras maiúsculas, com palavras separadas por underline para facilitar a leitura. Exemplo de definição de constantes:

```
public class Constantes {
    public static final String JANEIRO = "Janeiro";
    public static final double TAXA_RETIRADA = 10;
    public static final int NUMERO_DIAS_SEMANA = 7;
}
```

Nesse exemplo, a classe `Constantes` define três constantes: uma `String`, um `double`, e um `int`. Cada uma dessas constantes é `public`, `static` e `final`, de forma que qualquer outra classe possa acessar seus valores sem a possibilidade de modificá-los.

Para acessar uma constante, basta utilizar o nome da classe seguido do nome da constante:

```
public class TesteConstantes {
    public static void main(String[] args) {
        System.out.println(Constantes.JANEIRO); // Janeiro
        System.out.println(Constantes.TAXA_RETIRADA);   // 10.0
        System.out.println(Constantes.NUMERO_DIAS_SEMANA);  // 7
    }
}
```

Ao utilizar constantes, evita-se a repetição de valores fixos ao longo do código, o que facilita tanto a manutenção quanto a legibilidade, além de prevenir erros de digitação.