# 13. Herança

Uma classe que herda de outra é denominada subclasse, enquanto a classe de onde se herda é chamada de superclasse. A herança permite a reutilização de atributos e métodos de classes já definidas, possibilitando a criação de novas classes mais especializadas a partir de classes genéricas existentes.

Uma classe pode ter apenas uma superclasse, ou seja, a herança múltipla não é permitida. No entanto, uma classe pode ter um número ilimitado de subclasses. Dessa maneira, uma subclasse herda todas as características da superclasse, bem como de todas as classes acima dela na hierarquia.

A hierarquia de classes tem início na classe `Object`, a qual é a superclasse de todas as classes, seja de forma direta ou indireta, conforme ilustrado na Figura 13.1 a seguir:

<div align="center">
    <img src="../imgs/hierarquia.png" width="40%" style="max-height: 60vh;"/>
    <p>Figura 13.1: Hierarquia de classes.</p>
</div>

Conforme ilustrado na figura acima, a classe `Object` é a superclasse da classe `A`, que, por sua vez, serve como superclasse das classes `B` e `C`. Dessa forma, as classes `B` e `C` herdam todos os atributos e métodos da classe `A`, e, por conseguinte, da classe `Object`.

A palavra-chave `extends` é utilizada na declaração de uma classe para indicar sua superclasse. Se a classe não incluir essa palavra-chave em sua declaração, a herança será feita diretamente da classe `Object`. A sintaxe para declarar uma subclasse é a seguinte:

```
[public] class <subclasse> extends <superclasse> {
}
```

Dessa forma, a estrutura de herança em Java facilita a organização e reutilização de código, promovendo a especialização e a extensibilidade das classes.