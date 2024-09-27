# 15. Classe Abstrata

A classe `Conta` representa uma conta genérica que serve de base para outros tipos de conta, como conta corrente, poupança e investimento. Não faz sentido instanciar diretamente a classe `Conta`, pois uma "Conta Genérica" não existe no sistema. O que pode ser instanciado são as subclasses dessa classe. Para representar esse comportamento, utiliza-se uma classe abstrata.

O termo "abstrata" refere-se a algo com alto grau de generalização. Uma classe abstrata possui as seguintes características principais:

- Não pode ser instanciada.
- Pode, mas não precisa, conter métodos abstratos.

A primeira característica impede o uso do operador `new` para instanciar uma classe abstrata. Assim, nunca haverá uma instância dessa classe dentro de uma aplicação. O propósito de uma classe abstrata é atuar como uma superclasse, servindo como base para outras classes que serão desenvolvidas.

Uma classe que não é abstrata é chamada de classe concreta. Ao projetar uma hierarquia de herança, é necessário definir quais classes serão abstratas e quais serão concretas. Além disso, uma classe abstrata pode conter métodos abstratos, que são métodos sem implementação, apenas com a assinatura. Se uma subclasse concreta herdar de uma classe abstrata, ela deve implementar todos os métodos abstratos herdados.

Em classes concretas, não é permitido definir métodos abstratos. Se isso ocorrer, a classe deverá ser marcada como abstrata. Isso faz sentido, pois uma classe concreta com métodos não implementados seria impossível de instanciar de maneira funcional. Por essa razão, uma classe que contenha métodos abstratos deve ser definida como abstrata.

É possível ter uma hierarquia de herança com várias classes abstratas. No entanto, a primeira classe concreta na hierarquia será obrigada a implementar todos os métodos abstratos definidos nas suas superclasses. A implementação de métodos abstratos na subclasse é semelhante à sobrescrita de métodos, exigindo que a subclasse defina um método com a mesma assinatura da superclasse e o implemente.