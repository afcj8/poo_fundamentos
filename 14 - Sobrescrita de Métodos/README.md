# 14. Sobrescrita de Métodos

Sobrescrever um método significa redefinir, na subclasse, um método já existente na superclasse. Assim, quando o método `retirar` for chamado em um objeto do tipo `ContaCorrente`, o método sobrescrito na subclasse será executado, em vez do método original da superclasse. Para implementar isso, o método `retirar` na classe `ContaCorrente` precisa ter a mesma assinatura do método da classe `Conta`:

```
@Override
public void retirar(double valor) {
    valor = valor + 10;  // Soma a taxa de R$10 ao valor retirado
    super.retirar(valor);  // Chama o método retirar da classe Conta
}
``` 

A anotação `@Override` indica que o método sobrescreve um método da superclasse. No exemplo acima, o método `retirar` adiciona uma taxa de retirada de R$10 ao valor informado, antes de subtrair esse valor do saldo da conta. A palavra-chave `super` é utilizada para referenciar a superclasse, de modo que `super.retirar(valor)` chama o método `retirar` original da classe `Conta`. Esse conceito faz parte do polimorfismo, um dos pilares da programação orientada a objetos.

O polimorfismo permite que um objeto seja referenciado de diferentes formas. Quando um método é sobrescrito em uma subclasse, a versão do método que será chamada depende da instância do objeto. Por exemplo:

```
Conta conta = new Conta();
conta.retirar(100);  
```

Nesse caso, o método `retirar` chamado será o da classe `Conta`. Já no exemplo:

```
ContaCorrente conta = new ContaCorrente();
conta.retirar(100);  
```

O método `retirar` chamado será o da classe `ContaCorrente`.

Em uma situação alternativa:

```
Conta conta = new ContaCorrente();
conta.retirar(100);
```

Mesmo que a variável seja do tipo `Conta`, o método `retirar` chamado será o definido em `ContaCorrente`, pois a instância é do tipo `ContaCorrente`. Esse comportamento exemplifica o polimorfismo em ação, onde um objeto pode se comportar de maneira diferente dependendo de seu tipo real, mesmo que seja referenciado por um tipo genérico.

## 14.1. Construtores em Classes Estendidas

Os construtores das subclasses são obrigados a chamar um construtor da superclasse, utilizando a instrução `super`. Consideram-se as classes `Conta` e `ContaCorrente`:

```
public class Conta {

}

public class ContaCorrente extends Conta {

}
```

Os atributos e métodos foram omitidos para focar apenas nos construtores. Embora não estejam definidos, essas classes possuem um construtor padrão (sem argumentos) fornecido automaticamente pelo Java. O construtor padrão chama o construtor da superclasse direta; assim, o construtor da classe `ContaCorrente` invoca o construtor da classe `Conta`, e o construtor da classe `Conta` chama o construtor da classe `Object`.

A seguir, é definido um construtor para a classe `ContaCorrente`, que recebe um parâmetro que representa o tipo de conta:

```
public class ContaCorrente extends Conta {
    private String tipo;

    public ContaCorrente(String tipo) {
        this.tipo = tipo;
    }
}
```

Com a adição desse construtor, verifica-se que ele automaticamente chama o construtor da superclasse, o que torna a instrução `super()` na primeira linha do construtor redundante, já que o Java a incluirá caso nenhum construtor seja definido explicitamente.

```
public class ContaCorrente extends Conta {
    private String tipo;

    public ContaCorrente(String tipo) {
        super();
        this.tipo = tipo;
    }
}
```

Duas regras adicionais sobre construtores são as seguintes:

1. Construtores não são herdados.
2. A chamada ao construtor da superclasse deve ser sempre feita na primeira linha do construtor da subclasse.

Caso seja implementado um construtor que recebe um parâmetro na classe `Conta`, a classe `ContaCorrente` não herdará esse construtor:

```
public class Conta {
    private int numero;

    public Conta(int numero) {
        this.numero = numero;
    }
}
```

Após a definição desse construtor na classe `Conta`, a classe `ContaCorrente` apresentará um erro de compilação. Isso ocorre porque o construtor da classe `ContaCorrente` deve chamar o construtor da classe `Conta`, que agora possui apenas um construtor que recebe um parâmetro do tipo `int`.

Para corrigir o erro, é necessário modificar o construtor da classe `ContaCorrente` para chamar o construtor definido na classe `Conta`, utilizando a instrução `super` e passando o parâmetro do tipo inteiro:

```
public class ContaCorrente extends Conta {
    private String tipo;

    public ContaCorrente(int numero, String tipo) {
        super(numero);  // O construtor da subclasse chama o construtor da superclasse
        this.tipo = tipo;
    }
}
```

Em resumo, caso a chamada ao construtor da superclasse (`super`) não seja feita de forma explícita, o compilador adicionará automaticamente uma chamada ao construtor padrão (`super()`). Se a superclasse não dispuser de um construtor padrão, ocorrerá um erro de compilação, tornando imprescindível a chamada explícita à instrução `super`, juntamente com os parâmetros necessários para o construtor da superclasse.