# 23. Map

Mapas são estruturas úteis quando se deseja armazenar informações de forma que possam ser recuperadas rapidamente por meio de uma chave. Um exemplo seria armazenar objetos da classe Aluno em um mapa, utilizando o RM como chave. Assim, ao fornecer o RM, é possível recuperar todas as informações do aluno associado. Embora listas possam ser usadas para esse propósito, seria necessário percorrer todos os elementos para encontrar o aluno correto, o que comprometeria a performance, mesmo em listas pequenas.  

Um mapa é composto por pares de chave e valor, onde as chaves são únicas, mas os valores podem ser duplicados. A principal implementação da interface `Map` é a classe `HashMap`. A tabela a seguir descreve os métodos mais importantes da interface `Map`:

| Método        | Descrição                                          |
| ------------- | -------------------------------------------------- |
| clear         | Remove todos os mapeamentos.                       |
| containsKey   | Verifica se uma chave está presente no mapeamento. |
| containsValue | Verifica se um valor está presente no mapeamento.  |
| get           | Retorna o valor associado a uma chave específica.  |
| isEmpty       | Verifica se o mapeamento está vazio.               |
| keySet        | Retorna um conjunto contendo as chaves.            |
| put           | Adiciona um mapeamento de chave e valor.           |
| remove        | Remove um mapeamento.                              |
| size          | Retorna o número de mapeamentos.                   |
| values        | Retorna uma coleção com todos os valores.          |