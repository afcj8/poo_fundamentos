# 24. Generics

Até o momento, foi possível armazenar qualquer tipo de objeto em coleções, permitindo a mistura de diferentes tipos, como `String`, `int`, `double`, entre outros. No entanto, a partir do Java 5, introduziu-se o recurso de Generics, que permite restringir os tipos de dados aceitos em uma coleção. Dessa forma, apenas o tipo determinado no Generic poderá ser inserido na lista, garantindo mais segurança e clareza no código.

O uso de Generics permite a verificação de tipos em tempo de compilação, tornando o código mais legível, pois elimina a necessidade de realizar casts. A sintaxe é a seguinte:

```
ArrayList<Tipo> lista = new ArrayList<Tipo>();
```

No exemplo acima, define-se o tipo de dado que a lista poderá armazenar dentro do operador `<>`. Isso assegura que somente objetos desse tipo específico possam ser adicionados à lista. Sem o uso de Generics, seria necessário realizar o cast manualmente ao recuperar um objeto da lista, o que poderia resultar em exceções se o tipo não fosse compatível. Com Generics, esse problema é evitado, pois o compilador impede a inserção de objetos de tipos diferentes do especificado. Além disso, não é necessário realizar o cast para obter um objeto da lista, já que o tipo é garantido. Abaixo está um exemplo de uso:

```
import java.util.ArrayList;

public class ExemploGenerics {
    public static void main(String[] args) {
        ArrayList<Conta> listaConta = new ArrayList<Conta>();
        Conta c1 = new Conta(1234, 4321, 50);
        Conta c2 = new Conta(4321, 1234, 25);
        Conta c3 = new Conta(5678, 8765, 75);
        
        listaConta.add(c1);
        listaConta.add(c2);
        listaConta.add(c3);

        for (Conta conta : listaConta) {
            System.out.println(conta);
        }
    }
}
```

Neste exemplo, utiliza-se o laço `for-each` para percorrer a lista e imprimir cada objeto do tipo `Conta` no console. A vantagem de utilizar Generics é que não há necessidade de realizar o cast ao recuperar objetos da lista, pois o tipo é previamente definido.

Toda a API de coleções do Java suporta o uso de Generics, o que aumenta a segurança na manipulação dos tipos e elimina a necessidade de conversões. É importante observar que Generics só podem ser utilizados com tipos de objeto, e não com tipos primitivos. Abaixo, outros exemplos de uso de Generics com coleções:

```
HashSet<Cliente> clientes = new HashSet<Cliente>();
HashMap<String, Cliente> mapa = new HashMap<String, Cliente>();
```

No exemplo acima, apenas objetos do tipo `Cliente` podem ser armazenados no `HashSet`, e no `HashMap`, a chave é uma `String` e o valor um objeto `Cliente`. O uso de Generics em coleções é recomendado para garantir maior segurança e evitar erros em tempo de execução.