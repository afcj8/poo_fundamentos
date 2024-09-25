# 7. Classe

Uma classe em Java define a estrutura a partir da qual objetos serão criados. Para exemplificar, considere a implementação de uma classe que represente uma conta bancária. As informações que uma conta bancária precisa armazenar incluem o saldo, o número da conta, a agência, e o tipo de conta. Já as ações ou comportamentos relevantes dessa classe podem ser: realizar saques, depósitos e verificar o saldo.

Assim, uma classe chamada `Conta` pode ser desenvolvida contendo esses atributos e métodos. No entanto, é importante destacar que a classe é apenas um modelo para o conceito de conta bancária dentro de um sistema. No contexto da programação orientada a objetos, antes de realizar operações como depósitos ou saques, é necessário instanciar um objeto da classe `Conta`. Esse processo de criação de um objeto a partir de uma classe é denominado instanciação.

Em termos práticos, para instanciar uma classe, utiliza-se o operador `new`:

```
new Conta();
```