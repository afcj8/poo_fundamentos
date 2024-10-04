# 21. List

A interface `List` em Java representa uma sequência ordenada de elementos e permite a inclusão de elementos repetidos. Dessa forma, os elementos em uma lista são organizados conforme a ordem de inserção. Ao contrário dos arrays, não é necessário definir o tamanho de uma lista ao criá-la, já que a lista pode se ajustar dinamicamente conforme novos elementos são inseridos ou removidos. Além disso, a interface `List` facilita a manipulação de seus elementos, permitindo ordenação e busca por valores específicos.

A interface `List` define as funcionalidades que as classes concretas devem implementar para manipular listas. A implementação mais comumente utilizada é a `ArrayList`. A tabela a seguir apresenta os principais métodos de uma lista:

| Método      | Descrição                                               |
| ----------- | ------------------------------------------------------- |
| add         | Adiciona um objeto em uma posição específica.           |
| get         | Retorna o objeto localizado em uma posição determinada. |
| remove      | Remove um objeto de uma posição específica.             |
| set         | Substitui um objeto em uma determinada posição.         |
| indexOf     | Retorna a posição de um objeto na lista.                |
| lastIndexOf | Retorna a última posição de um objeto na lista.         |
| sublist     | Retorna uma sublista a partir da lista original.        |