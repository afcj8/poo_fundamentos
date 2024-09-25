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