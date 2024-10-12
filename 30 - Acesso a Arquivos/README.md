# 30. Acesso a Arquivos

O armazenamento de dados em variáveis, arrays, coleções ou outras estruturas em memória é temporário; todas as informações armazenadas são perdidas quando o programa termina. Para garantir a persistência de dados, mesmo após a finalização de um programa, utilizam-se arquivos.

Bancos de dados são as estruturas mais adequadas para armazenar grandes volumes de informações, como clientes, produtos ou vendas de uma empresa. No entanto, arquivos são especialmente úteis para armazenar configurações de programas, evitando que elas estejam diretamente no código-fonte. Isso permite alterar configurações sem recompilar ou empacotar novamente o programa, o que seria inviável se as configurações estivessem embutidas no código. Arquivos também são amplamente utilizados para integrar sistemas diferentes, onde um sistema processa dados e gera um arquivo que outro sistema pode ler. Por exemplo, um sistema de processamento pode gerar um arquivo de fatura de telefone, que outro sistema, ao lê-lo, disponibiliza ao usuário final pela internet.

Em Java, a leitura e gravação de arquivos são facilitadas pela independência de plataforma, dispensando preocupações com o sistema operacional. A manipulação de arquivos é feita com objetos que representam fluxos de dados, chamados de streams. Streams são sequências de dados que representam uma fonte (entrada) ou um destino (saída). Existem dois tipos de streams:

- Output stream: grava dados em um destino.
- Input stream: lê dados de uma fonte.

Arquivos de texto, por sua simplicidade, são facilmente manipuláveis em Java e entendidos por diferentes programas. Neles, registros geralmente correspondem a linhas, e campos a colunas ou valores separados por vírgulas. Para gravar dados em um arquivo de texto, três passos básicos são seguidos:

- Abrir o arquivo.
- Gravar os dados.
- Fechar o arquivo.

As classes para manipulação de arquivos estão no pacote `java.io`. Para escrita em arquivos de texto, as classes `FileWriter` e `PrintWriter` são amplamente utilizadas.

A classe `FileWriter` herda de `OutputStreamWriter` e pode ser utilizada para abrir arquivos em modo de escrita. Para escrever no arquivo, utiliza-se a classe `PrintWriter`, que recebe como argumento um objeto `FileWriter`.

```
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscreveArquivo {
    public static void main(String[] args) {
        try {
            FileWriter stream = new FileWriter("arquivo.txt");
            PrintWriter print = new PrintWriter(stream);
            print.println("Teste");
            print.println("Escrevendo no arquivo");
            print.close();
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

No exemplo acima, o método `main` abre, escreve e fecha um arquivo chamado “arquivo.txt”. Se o arquivo já existir, ele será aberto; caso contrário, será criado. Na instância de `FileWriter`, é necessário fornecer o caminho e o nome do arquivo. Como nenhum caminho específico foi fornecido, o arquivo será criado na pasta raiz do programa.

É possível especificar um caminho completo, como no exemplo a seguir:

```
FileWriter stream = new FileWriter("C://arquivo.txt");
```

Após instanciar o objeto `FileWriter`, o `PrintWriter` é criado utilizando o objeto de `FileWriter`:

```
PrintWriter print = new PrintWriter(stream);
```

A partir do `PrintWriter`, podem-se usar os métodos `print` ou `println` para inserir dados no arquivo:

```
print.println("Teste");
print.println("Escrevendo no arquivo");
```

Para concluir, é necessário chamar o método `close` tanto em `PrintWriter` quanto em `FileWriter`, para fechar o arquivo e liberar os recursos:

```
print.close();
stream.close();
```

Como a abertura e manipulação de arquivos podem gerar exceções, a exceção `IOException` deve ser tratada para evitar erros durante a execução. O resultado do programa será um arquivo de texto com as informações gravadas conforme especificado.

Para ler um arquivo em Java, é necessário realizar três etapas principais:

- Abrir o arquivo.
- Ler os dados.
- Fechar o arquivo.

As classes mais comumente usadas para leitura de dados de um arquivo são `java.io.FileReader` e `java.io.BufferedReader`. A classe `FileReader` é uma subclasse de `InputStreamReader`, projetada para ler fluxos de entrada baseados em caracteres.

O exemplo a seguir ilustra a abertura e leitura do arquivo "arquivo.txt", exibindo cada linha no console:

```
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) {
        try {
            FileReader stream = new FileReader("arquivo.txt");
            BufferedReader reader = new BufferedReader(stream);
            String linha = reader.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = reader.readLine();
            }
            reader.close();
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```