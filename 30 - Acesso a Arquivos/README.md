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