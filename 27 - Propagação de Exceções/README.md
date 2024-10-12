# 27. Propagação de Exceções

Um método pode optar por não tratar uma exceção e, em vez disso, propagá-la para o método que o chamou. Dessa forma, o método chamador é notificado sobre a ocorrência de uma exceção. exemplo a seguir, é criada uma classe chamada `Calculadora`, responsável por implementar operações aritméticas, como a divisão:

```
public class Calculadora {
    public int divisao(int n1, int n2) {
        return n1 / n2;
    }
}
```

Caso o valor de `n2` seja zero, o método lançará uma exceção.