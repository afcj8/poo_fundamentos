# 8. Métodos

Os métodos de uma classe definem os comportamentos que os objetos derivados dela podem realizar. Um comportamento pode ser entendido como uma ação ou um serviço prestado pelo objeto. Por exemplo, em uma classe `Conta`, comportamentos como "recuperar o saldo", "depositar" e "retirar dinheiro" representam ações que o objeto pode executar.

Um método, portanto, é um comportamento específico que pertence a um objeto e define como ele deve agir quando solicitado, descrevendo suas habilidades. Por convenção, os nomes dos métodos devem seguir o padrão lowerCamelCase, assim como os atributos. Além disso, recomenda-se o uso de verbos para nomeá-los, uma vez que representam ações. Exemplos incluem `exibirSaldo`, `depositar` e `calcularTaxa`.

A estrutura básica para a declaração de um método é a seguinte:

```
<modificador> <tipo de retorno> <nomeDoMetodo>(<[lista de parâmetros]>) {
    instruções;
}
```

No código abaixo, são definidos os métodos `recuperarSaldo` e `depositar`:

```
public class Conta {
    // atributo
    double saldo;

    // métodos
    public double recuperarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }
}
```

Para que o método possa devolver um valor, é necessário definir o tipo de retorno. No exemplo acima, o método `recuperarSaldo` retorna um valor do tipo `double`, utilizando a instrução `return` para devolver o valor armazenado no atributo `saldo`.

Caso o método não precise retornar um valor, utiliza-se o tipo de retorno `void`, como no caso do método `depositar`, que apenas atualiza o valor do saldo, sem retornar nada.

Além disso, métodos podem receber valores por meio de parâmetros. Esses parâmetros são declarados na lista de argumentos, que consiste em variáveis separadas por vírgulas e definidas entre parênteses. Quando o método é chamado, os parâmetros recebem valores e se comportam como variáveis locais dentro do método. Conforme o exemplo a seguir:

```
double somar(double valor1, double valor2) {
    return valor1 + valor2;
}
```

Nesse caso, o método `somar` recebe dois parâmetros (`valor1` e `valor2`) e retorna a soma de ambos. Dessa forma, os métodos fornecem aos objetos a capacidade de executar ações específicas, sendo essenciais para a implementação de comportamentos nas classes.

## 8.1. Sobrecarga de Métodos

Na Programação Orientada a Objetos (POO), um recurso comum é a sobrecarga de métodos. Sobrecarga refere-se à criação de várias versões de um mesmo método, diferenciadas pelo número ou tipo de parâmetros que recebem. O tipo de retorno, no entanto, não influencia a sobrecarga.

Duas características são essenciais para diferenciar métodos com o mesmo nome: a quantidade de parâmetros e seus tipos. Essas características compõem a assinatura do método. O uso de múltiplos métodos com o mesmo nome, mas com assinaturas distintas, caracteriza a sobrecarga de métodos. O exemplo a seguir ilustra essa técnica:

```
public class Conta {
    // atributo
    double saldo;

    // método com um parâmetro do tipo double
    public void retirar(double valor) {
        saldo = saldo - valor;
    }

    // método com dois parâmetros do tipo double
    public void retirar(double valor, double taxa) {
        saldo = saldo - valor - taxa;
    }
}
```

No exemplo acima, a classe `Conta` define dois métodos chamados `retirar`, mas com assinaturas diferentes. Um método aceita apenas o valor a ser retirado, enquanto o outro também recebe o valor da taxa de retirada.

A sobrecarga de métodos permite que um mesmo método se comporte de forma distinta, dependendo dos argumentos fornecidos. Quando um método é invocado em um objeto, o Java seleciona a versão adequada com base no nome do método e nos parâmetros fornecidos.

Outro conceito relevante é o uso da palavra reservada `this`. Ela é utilizada para referenciar o próprio objeto, permitindo o acesso a seus atributos, métodos e construtores. Quando há duas variáveis com o mesmo nome — uma pertencente à instância da classe (atributo) e outra pertencente ao método — a palavra `this` é empregada para diferenciar o atributo da classe, como demonstrado no código a seguir:

```
public class Conta {
    // atributo
    int agencia;

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}
```

Nesse exemplo, `this.agencia` faz referência ao atributo da classe, diferenciando-o da variável local `agencia` recebida como argumento no método `setAgencia`. Isso garante clareza e evita ambiguidades no código.

## 8.2. Construtor

Na Programação Orientada a Objetos, é possível definir métodos especiais denominados construtores, que são executados automaticamente quando objetos de uma classe são criados. Esses métodos auxiliam na inicialização do objeto, podendo atribuir valores padrão aos atributos ou valores fornecidos no momento da criação, além de permitir a chamada de outros métodos.

Um construtor é invocado sempre que se utiliza a instrução `new` para criar uma instância de uma classe. Durante esse processo, o Java executa três etapas:

1. Alocação de memória para o objeto;
2. Inicialização dos atributos com valores padrão ou iniciais;
3. Chamada ao construtor da classe.

Construtores se assemelham a métodos comuns, mas possuem três diferenças fundamentais:

1. Têm o mesmo nome da classe;
2. Não possuem tipo de retorno, nem mesmo `void`;
3. Não podem utilizar a instrução `return` para devolver valores.

Toda classe contém, no mínimo, um construtor. Se nenhum construtor for declarado, o Java fornece um construtor padrão, sem parâmetros. No entanto, caso algum construtor seja especificado, o construtor padrão não será mais gerado automaticamente. A seguir, há um exemplo de construtor simples:

```
public class Conta {
    // atributo
    double saldo;

    // construtor
    public Conta() {
        saldo = 100;
        System.out.println("Criando uma instância de Conta...");
    }
}
```