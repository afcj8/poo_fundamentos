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