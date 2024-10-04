# 24. Generics

Até o momento, foi possível armazenar qualquer tipo de objeto em coleções, permitindo a mistura de diferentes tipos, como `String`, `int`, `double`, entre outros. No entanto, a partir do Java 5, introduziu-se o recurso de Generics, que permite restringir os tipos de dados aceitos em uma coleção. Dessa forma, apenas o tipo determinado no Generic poderá ser inserido na lista, garantindo mais segurança e clareza no código.

O uso de Generics permite a verificação de tipos em tempo de compilação, tornando o código mais legível, pois elimina a necessidade de realizar casts. A sintaxe é a seguinte:

```
ArrayList<Tipo> lista = new ArrayList<Tipo>();
```

No exemplo acima, define-se o tipo de dado que a lista poderá armazenar dentro do operador `<>`. Isso assegura que somente objetos desse tipo específico possam ser adicionados à lista. Sem o uso de Generics, seria necessário realizar o cast manualmente ao recuperar um objeto da lista, o que poderia resultar em exceções se o tipo não fosse compatível. Com Generics, esse problema é evitado, pois o compilador impede a inserção de objetos de tipos diferentes do especificado. Além disso, não é necessário realizar o cast para obter um objeto da lista, já que o tipo é garantido.