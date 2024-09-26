# 7. Classe

Uma classe em Java define a estrutura a partir da qual objetos serão criados. Um exemplo de implementação pode ser a de uma classe que represente uma conta bancária. As informações que uma conta bancária precisa armazenar incluem o saldo, o número da conta, a agência, e o tipo de conta. Já as ações ou comportamentos relevantes dessa classe podem ser: realizar saques, depósitos e verificar o saldo.

Assim, uma classe chamada `Conta` pode ser desenvolvida contendo esses atributos e métodos. No entanto, é importante destacar que a classe é apenas um modelo para o conceito de conta bancária dentro de um sistema. No contexto da programação orientada a objetos, antes de realizar operações como depósitos ou saques, é necessário instanciar um objeto da classe `Conta`. Esse processo de criação de um objeto a partir de uma classe é denominado instanciação.

Em termos práticos, para instanciar uma classe, utiliza-se o operador `new`:

```
new Conta();
```

No exemplo acima, foi criado um novo objeto do tipo `Conta`. Contudo, é necessário armazenar esse objeto em uma variável para poder utilizá-lo posteriormente. Isso é feito declarando uma variável do tipo da classe e atribuindo a ela o objeto criado:

```
Conta cc = new Conta();
Conta poupanca = new Conta();
```

Neste caso, as variáveis `cc` e `poupanca` armazenam as referências a dois objetos distintos do tipo `Conta`. Assim como em um banco real, onde é possível possuir várias contas, no programa é possível instanciar múltiplos objetos da mesma classe, como no exemplo acima.

As classes em Java são definidas em arquivos separados, com a extensão `.java`, e o nome do arquivo deve corresponder ao nome da classe. Por convenção, os nomes de classes seguem o padrão UpperCamelCase, no qual cada palavra do nome da classe começa com letra maiúscula, como em `Conta`, `ContaCorrente` ou `ContaPoupanca`. Para definir uma classe em Java, utiliza-se a palavra reservada `class`:

```
class Conta {
    // atributos e métodos da classe
}
```

## 7.1. Atributos

Uma classe em Java pode conter um ou mais atributos, os quais são utilizados para armazenar informações específicas de um objeto após a classe ser instanciada. Essas informações diferenciam um objeto de outro.

Os atributos em uma classe são definidos por variáveis, que podem ser de tipos primitivos ou de referência. No caso de tipos de referência, a variável armazena um ponteiro para um objeto. Por exemplo, a classe `Conta` pode conter uma variável que armazena a referência a um objeto `Cliente`, estabelecendo uma relação entre a conta e o cliente.

Por convenção, os nomes dos atributos seguem o padrão lowerCamelCase, onde a primeira letra é minúscula e as letras iniciais das palavras subsequentes são maiúsculas. É recomendável o uso de nomes descritivos e substantivos para os atributos, como `saldo`, `dataNascimento` ou `email`. Nomes pouco claros, como `x`, `y` ou `abc`, devem ser evitados.

As variáveis que definem um atributo em uma classe são chamadas de variáveis de instância, pois elas somente armazenam dados após a criação de um objeto, ou seja, após a instanciação da classe. A sintaxe para declarar uma variável de instância é similar à de variáveis locais. Conforme o exemplo abaixo:

```
public class Conta {
    int numero;
    int agencia;
    double saldo = 100;
    Calendar dataAbertura;
    String tipo;
    Cliente cliente;
}
```