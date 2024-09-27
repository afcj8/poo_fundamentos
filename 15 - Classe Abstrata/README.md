# 15. Classe Abstrata

A classe `Conta` representa uma conta genérica que serve de base para outros tipos de conta, como conta corrente, poupança e investimento. Não faz sentido instanciar diretamente a classe `Conta`, pois uma "Conta Genérica" não existe no sistema. O que pode ser instanciado são as subclasses dessa classe. Para representar esse comportamento, utiliza-se uma classe abstrata.

O termo "abstrata" refere-se a algo com alto grau de generalização. Uma classe abstrata possui as seguintes características principais:

- Não pode ser instanciada.
- Pode, mas não precisa, conter métodos abstratos.