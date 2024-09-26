# 11. Modificadores de Acesso

Os modificadores são palavras-chave que alteram as definições de uma classe, método, atributo ou construtor em Java. Entre os modificadores mais comuns, encontram-se `static`, `abstract` e `final`. Além disso, a linguagem Java disponibiliza três modificadores de acesso: `public`, `protected` e `private`. Caso nenhum modificador seja especificado, o nível de acesso padrão (default) é aplicado.

Os modificadores de acesso mais frequentemente utilizados nos sistemas controlam a visibilidade de métodos, atributos e construtores, determinando quais elementos serão acessíveis a outras classes. A tabela a seguir apresenta uma visão geral sobre os modificadores:

| Modificador | Descrição |
| ----------- | --------- |
| `private`   | Atributos, métodos e construtores são acessíveis apenas dentro da própria classe. |
| default     | Atributos, métodos e construtores são acessíveis apenas por classes do mesmo pacote. |
| `protected` | 	Atributos, métodos e construtores são acessíveis dentro da própria classe, em subclasses e em classes do mesmo pacote. |
| `public`    | Atributos e métodos são acessíveis em qualquer classe. |

Quando os membros da classe não possuem modificador de acesso, o nível padrão é aplicado, permitindo o acesso a métodos, atributos e construtores por classes do mesmo pacote. Um "pacote" refere-se à estrutura de organização das classes em diretórios.

O modificador `private` é amplamente utilizado para promover o encapsulamento, um dos pilares da programação orientada a objetos. O objetivo do encapsulamento é proteger atributos e métodos contra acessos indevidos por outras classes.

O modificador `protected` restringe a visibilidade de métodos, construtores e atributos de duas formas: dentro das subclasses e nas classes do mesmo pacote. Embora semelhante ao nível padrão, `protected` permite o acesso a membros da classe em subclasses, mesmo que estejam em pacotes diferentes, o que o diferencia do nível default.