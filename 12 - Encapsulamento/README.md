# 12. Encapsulamento

O encapsulamento é uma técnica aplicada a métodos e atributos de uma classe com o objetivo de proteger ou ocultar dados. Para encapsular um método, utiliza-se o nível de acesso mais restritivo, garantindo que ele só seja acessado internamente pela própria classe. Já os atributos, para serem controlados ou modificados, devem ter seus valores gerenciados por métodos específicos.

A prática comum é marcar os atributos de uma classe com o modificador de acesso mais restrito, como `private`, a menos que haja uma justificativa sólida para permitir outro nível de visibilidade. A concessão de acesso irrestrito a um atributo não é recomendada, pois uma mudança na estrutura interna da classe afetaria as demais classes que dependem dela, limitando a flexibilidade do código. O encapsulamento traz benefícios como:

- **Ocultação da implementação interna:** Para usar uma classe que envia e-mails, por exemplo, é necessário conhecer apenas os dados que a classe precisa para realizar o envio, sem se preocupar com o processo interno.
- **Controle de acesso aos dados:** Permite definir como os dados podem ser lidos e escritos.
- **Proteção dos dados:** Evita modificações indesejadas ou incorretas nos atributos de um objeto.

O uso de métodos de leitura (get) e escrita (set) desacopla os atributos de uma classe dos clientes que os utilizam. No exemplo a seguir, o atributo `idade` está encapsulado:

```
public class Pessoa {
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
```