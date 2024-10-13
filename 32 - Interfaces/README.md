# 32. Interfaces

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