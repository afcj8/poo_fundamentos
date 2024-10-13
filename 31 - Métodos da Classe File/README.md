# 31. Métodos da Classe File

A classe `File` da API de IO do Java é usada para representar arquivos e diretórios no sistema de arquivos nativo. Esta classe oferece métodos para manipular propriedades e informações sobre arquivos e diretórios, como verificação de permissões, existência, criação, renomeação, entre outros. No entanto, a classe `File` não permite a leitura ou escrita de conteúdo; sua principal função é gerenciar o arquivo ou diretório, e não seu conteúdo.

| Método      | Descrição                                       |
| ----------- | ----------------------------------------------- |
| exists      | Verifica se um arquivo ou diretório existe.     |
| isDirectory | Verifica se o objeto é um diretório.            |
| isFile      | Verifica se o objeto é um arquivo.              |
| canRead     | Verifica se o arquivo pode ser lido.            |
| canWrite    | Verifica se o arquivo pode ser escrito.         |
| mkdir       | Cria um diretório.                              |
| renameTo    | Renomeia um arquivo ou diretório.               |
| length      | Retorna o tamanho do arquivo.                   |
| delete      | Exclui um arquivo ou diretório.                 |
| getPath     | Retorna o caminho do arquivo ou diretório.      |

O exemplo a seguir mostra como criar um objeto `File`, verificar se o arquivo existe e recuperar informações sobre ele. Se o arquivo não existir, ele será criado.

```
import java.io.File;
import java.io.IOException;

public class ManipulaArquivo {
    public static void main(String[] args) {
        File arquivo = new File("arquivo.txt");

        if (arquivo.exists()) {
            System.out.println("O arquivo existe!" +
                "\nPode ser lido: " + arquivo.canRead() +
                "\nPode ser gravado: " + arquivo.canWrite() +
                "\nTamanho: " + arquivo.length() +
                "\nCaminho: " + arquivo.getPath());
        } else {
            try {
                if (arquivo.createNewFile())
                    System.out.println("Arquivo criado!");
                else
                    System.out.println("Arquivo não criado!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

Caso o arquivo seja criado com sucesso, o método `createNewFile()` retorna `true`; caso contrário, retorna `false`.

## 31.1. Manipulando Diretórios com a Classe File

A classe `File` também pode ser utilizada para verificar a existência de diretórios ou criar novos diretórios, conforme ilustrado a seguir:

```
import java.io.File;

public class ManipulaDiretorio {
    public static void main(String[] args) {
        File diretorio = new File("meu_diretorio");

        if (diretorio.exists()) {
            System.out.println("Diretório existe!");
        } else {
            if (diretorio.mkdir()) {
                System.out.println("Diretório criado!"); 
            }else {
                System.out.println("Diretório não criado.");
            }
        }
    }
}
```
