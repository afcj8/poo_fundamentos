# 20. Collections

Em Java, arrays podem ser utilizados para armazenar elementos do mesmo tipo. No entanto, sua manipulação pode ser trabalhosa, pois o tamanho de um array é fixo. Caso seja necessário armazenar mais elementos do que o tamanho inicialmente definido, é preciso criar um novo array e transferir os dados do array antigo para o novo. Além disso, encontrar um elemento pelo seu valor exige percorrer todo o array, pois a busca direta é possível apenas através do índice.

Ao criar um array, define-se seu tamanho total, mas não há uma forma simples de verificar quantas posições estão preenchidas. Para encontrar uma posição vazia e armazenar um novo elemento, o array precisa ser percorrido. Caso não haja mais espaços disponíveis, será necessário criar um novo array, repetindo o processo de transferência dos dados.

Devido a essas limitações, a plataforma Java oferece o Collections Framework, um conjunto de classes e interfaces que representam estruturas de dados mais avançadas e flexíveis. Coleções são utilizadas para armazenar e organizar objetos de maneira eficiente, permitindo a implementação de estruturas como listas, pilhas, filas, conjuntos, mapas e outras. Elas são amplamente utilizadas em aplicações Java, especialmente para manipular dados resultantes de consultas a bancos de dados.

As coleções são definidas por meio de interfaces, que especificam as funcionalidades que devem ser implementadas por classes concretas. Em Java, as coleções podem ser divididas em duas categorias principais: aquelas que implementam a interface `Collection` e aquelas que implementam a interface `Map`.

As principais subinterfaces de `Collection` incluem:

- **List:** Representa uma lista de objetos. A implementação mais comum é o `ArrayList`.
- **Set:** Representa um conjunto de objetos únicos, ou seja, objetos que não se repetem. A implementação mais utilizada é o `HashSet`.

A interface `Map`, por outro lado, representa uma estrutura que armazena pares de chave e valor, facilitando a recuperação de valores a partir de uma chave. A principal subinterface é:

- **SortedMap:** Representa um mapa ordenado. A implementação mais comum é o `HashMap`.

A interface `Collection` serve como base para todas as coleções (exceto mapas) e define métodos comuns às suas subinterfaces, como `List`, `Set` e `Queue`. Os principais métodos da interface `Collection` incluem:

- **add:** Adiciona um objeto à coleção.
- **clear:** Remove todos os objetos da coleção.
- **contains:** Verifica se a coleção contém um determinado objeto.
- **isEmpty:** Verifica se a coleção está vazia.
- **remove:** Remove um objeto da coleção.
- **size:** Retorna a quantidade de objetos na coleção.
- **toArray:** Retorna um array contendo os elementos da coleção.

O Collections Framework torna o armazenamento e a manipulação de dados em Java mais eficiente, superando as limitações dos arrays convencionais.