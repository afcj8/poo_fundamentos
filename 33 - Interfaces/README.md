# 33. Interfaces

Na programação orientada a objetos, o conceito de interface é utilizado para definir um conjunto de requisitos que as classes devem implementar. A interface não é uma classe e, portanto, não pode ser instanciada. Ela funciona como um contrato que estabelece quais métodos uma classe deve implementar para garantir um comportamento específico.

Em Java, uma interface contém métodos e atributos. No entanto, ao contrário das classes, todos os métodos de uma interface são implicitamente públicos e abstratos, enquanto os atributos são públicos, estáticos e finais, ou seja, são constantes. Interfaces em Java não possuem construtores, uma vez que não podem ser instanciadas diretamente.

Java não permite herança múltipla de classes, ou seja, uma classe não pode herdar diretamente de mais de uma classe. No entanto, uma classe pode implementar múltiplas interfaces. Para isso, é necessário que a classe forneça a implementação de todos os métodos exigidos por cada interface.

As classes abstratas, que também não podem ser instanciadas, podem optar por não implementar todos os métodos das interfaces. Porém, em classes concretas, a implementação de todos os métodos definidos pelas interfaces é obrigatória, sob pena de erro de compilação.

A seguir, tem-se um exemplo de interface em Java:

```
public interface Autenticavel {
    boolean login(String usuario, String senha);
    void logou();
    void deslogar();
    boolean isLogado();
}
```

Neste exemplo, a interface `Autenticavel` define os seguintes métodos: `login`, `logou`, `deslogar` e `isLogado`. Todos os métodos devem ser implementados por qualquer classe que queira cumprir o contrato estabelecido por esta interface.

Para implementar uma interface, uma classe utiliza a palavra-chave `implements`:

```
public class Usuario implements Autenticavel {
    private String usuario;
    private String senha;
    private boolean logado;

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public boolean login(String usuario, String senha) {
        if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
            logado = true;
            return true;
        }
        return false;
    }

    @Override
    public void logou() {
        System.out.println("Usuário logado com sucesso!");
    }

    @Override
    public void deslogar() {
        logado = false;
    }

    @Override
    public boolean isLogado() {
        return logado;
    }
}
```

Aqui, a classe `Usuario` implementa a interface `Autenticavel`, o que significa que deve fornecer uma implementação para todos os métodos da interface. Caso contrário, um erro de compilação será gerado.

Se uma classe precisar implementar várias interfaces, é possível fazê-lo separando-as por vírgula:

```
public class Usuario implements Autenticavel, Serializable {
    // Implementação dos métodos de ambas as interfaces
}
```

Quando uma classe implementa interfaces e herda de uma classe, a herança deve ser definida primeiro, seguida das interfaces:

```
public class Usuario extends Pessoa implements Autenticavel {
    // Implementação dos métodos de Autenticavel e funcionalidades da classe Pessoa
}
```

Com isso, a classe `Usuario` herda de `Pessoa` e implementa `Autenticavel`, respeitando tanto a herança quanto os contratos estabelecidos pelas interfaces. Esse uso de interfaces permite maior flexibilidade no design, facilitando a implementação de comportamentos variados sem a necessidade de herança múltipla direta.

Em Java, uma interface pode estender outras interfaces, possibilitando a criação de hierarquias de interfaces. Isso é feito utilizando a palavra-chave `extends`:

```
public interface Gerenciavel extends Autenticavel {
}

public interface Gerenciavel extends Autenticavel, Serializable {
}
```

Ao permitir a extensão de múltiplas interfaces, o Java facilita a combinação de diferentes comportamentos em uma única interface, sem a necessidade de herança múltipla de classes.

## 33.1. Métodos Concretos em Interfaces

Interfaces também podem conter métodos concretos. Um método concreto em uma interface é definido usando o modificador `default`. Esses métodos, conhecidos como default methods, são herdados por todas as classes que implementarem a interface, dispensando a necessidade de implementá-los diretamente:

```
public interface Corredor {
    default void parar() {
        System.out.println("Parando..");
    }
}
```

No exemplo acima, qualquer classe que implemente a interface `Corredor` herdará o método `parar`, sem necessidade de implementação. Por exemplo:

```
public class Avestruz implements Corredor {
}
```

A classe `Avestruz` herda o método `parar()` automaticamente, podendo utilizá-lo ou sobrescrevê-lo se necessário:

```
public class Avestruz implements Corredor {
    @Override
    public void parar() {
        System.out.println("Avestruz parando...");
    }
}
```

## 33.2. Métodos Estáticos em Interfaces

Além dos métodos `default`, uma interface pode definir métodos `static`. Métodos `static` pertencem à interface e não podem ser sobrescritos por classes que a implementam. Para chamá-los, é necessário referenciar diretamente a interface, e não a classe implementadora ou uma instância:

```
public interface Corredor {
    default void parar() {
        System.out.println("Parando..");
    }
    
    static void acelerar() {
        System.out.println("Acelerando");
    }
}
```

Neste caso, o método `acelerar()` é estático e só pode ser acessado diretamente pela interface `Corredor`:

```
public static void main(String[] args) {
    Corredor corredor = new Avestruz();
    corredor.parar();        // Executa o método `parar`
    Corredor.acelerar();      // Executa o método `acelerar` da interface
}
```

## 33.3. Interface com Métodos Abstratos, Defaults e Estáticos

É possível combinar métodos abstratos, `default` e `static` em uma mesma interface. Métodos abstratos não possuem implementação e devem ser implementados pelas classes concretas que adotarem a interface:

```
public interface Corredor {
    void correr(int velocidade); // Método abstrato
    default void parar() {
        System.out.println("Parando..");
    }
    static void acelerar() {
        System.out.println("Acelerando");
    }
}
```

Nesse exemplo, qualquer classe que implemente `Corredor` precisará implementar o método `correr`. Já os métodos `parar` e `acelerar` têm implementações padrão fornecidas pela interface, sendo que o primeiro pode ser sobrescrito enquanto o segundo é estático e, portanto, imutável.

Assim, o uso de `default` e `static` em interfaces permite a criação de métodos reutilizáveis e flexíveis, além de simplificar a estrutura de código ao evitar a duplicação de lógica entre classes.