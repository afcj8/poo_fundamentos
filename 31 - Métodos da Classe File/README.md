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