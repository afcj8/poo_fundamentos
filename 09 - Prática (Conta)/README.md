# 9. Prática

Para ilustrar os conceitos abordados, pode-se criar uma classe `Conta` com os atributos `saldo`, `agencia` e `numero`, além de métodos para realizar operações de saque, depósito e consulta de saldo. São definidos dois construtores: um padrão (sem parâmetros) e outro que recebe os valores de `numero`, `agencia` e `saldo`. O código a seguir exemplifica essa implementação:

```
public class Conta {
    int numero, agencia;
    double saldo;

    public Conta() { }

    public Conta(int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void retirar(double valor) {
        saldo = saldo - valor;
    }

    public double verificarSaldo() {
        return saldo;
    }
}
```

Em seguida, cria-se uma classe `Teste` com o método `main`, que será responsável por criar instâncias da classe `Conta`.

```
public class Teste {
    public static void main(String[] args) {

    }
}
```

Dentro do método `main`, pode-se instanciar a classe `Conta`, armazenando a referência do objeto em uma variável, como exemplificado a seguir:

```
public class Teste {
    public static void main(String[] args) {
        Conta cc = new Conta();
    }
}
```

A variável `cc` armazenará a referência ao objeto `Conta`, permitindo o acesso aos seus atributos e métodos. O operador ponto (.) é utilizado para acessar as variáveis de instância e métodos do objeto. Por exemplo, para acessar o atributo `saldo` do objeto referenciado por `cc`, pode-se utilizar o seguinte código:

```
double valor = cc.saldo;
System.out.println(cc.saldo);
```

Na primeira linha, o valor do atributo `saldo` é atribuído à variável `valor`, e na segunda, o valor do saldo é impresso no console. Para alterar o valor de um atributo, utiliza-se o operador de atribuição:

```
cc.saldo = 100;
```

Para invocar um método, a notação de ponto é semelhante:

```
cc.depositar(100);
cc.verificarSaldo();
```

O exemplo abaixo demonstra a criação de mais uma instância da classe `Conta`, onde se atribuem valores aos atributos e se chamam métodos da classe:

```
public class Teste {
    public static void main(String[] args) {
        // Criação de um objeto Conta
        Conta cc = new Conta();

        // Atribuição de valores aos atributos do objeto
        cc.numero = 321;
        cc.agencia = 123;
        cc.saldo = 100;

        // Chamada do método depositar
        cc.depositar(50);

        // Verificação do saldo e impressão no console
        System.out.println(cc.verificarSaldo()); // 150.0

        // Criação de um objeto utilizando o construtor com parâmetros
        Conta poupanca = new Conta(111, 222, 1000);

        // Chamada do método retirar
        poupanca.retirar(50);

        // Verificação do saldo e impressão no console
        System.out.println(poupanca.verificarSaldo());  // 950.0
    }
}
```