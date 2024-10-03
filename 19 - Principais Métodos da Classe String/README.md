# 19. Principais Métodos da Classe String

Compreender os recursos da classe `String` permite que desenvolvedores criem aplicações mais eficientes e confiáveis. A seguir, são apresentados os principais métodos da classe String em Java.

## 19.1. Método startsWith

O método `startsWith` permite verificar se uma string começa com uma sequência específica de caracteres. Ele recebe como argumento a sequência a ser verificada.

```
public class MetodoStartsWith {
    public static void main(String[] args) {
        String nome = "Antônio Junior";
        if (nome.startsWith("Antônio")) {
            System.out.println("A String começa com Antônio");
        } else {
            System.out.println("A String não começa com Antônio");
        }
    }
}
```

No exemplo acima, o resultado será "A String começa com Antônio". Por padrão, o Java diferencia maiúsculas e minúsculas ao comparar strings. Apenas métodos como `equalsIgnoreCase` ignoram essa distinção, enquanto métodos como `startsWith` consideram as diferenças entre letras maiúsculas e minúsculas.