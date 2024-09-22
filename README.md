# Introdução à Linguagem Java

A primeira versão da linguagem Java surgiu em 1995, criada por um time de desenvolvedores da empresa Sun Microsystem, liderado por James Gosling. A ideia inicial era desenvolver uma linguagem para controlar pequenos dispositivos, como televisores, videocassetes e aparelhos de TV a cabo. A ideia não deu certo, mas como advento da internet, a plataforma foi adotada, se expandiu e evoluiu, e atualmente é uma referência no mercado de desenvolvimento de sistemas.

Java se tornou popular pelo uso na internet e hoje roda em muitos equipamentos e dispositivos: notebooks, celulares, videogames, cartões inteligentes etc. Pode-se elencar várias características-chave para a plataforma ter alcançado tanto sucesso:

- **Simples:** a sintaxe do Java é uma versão limpa da sintaxe das linguagens da época, como C++. Não há a necessidade de arquivos de cabeçalho ou trabalhar com ponteiros (alocar memória da máquina para armazenar informações).
- **Robusto:** Java foi concebido para desenvolver programas confiáveis, em vários aspectos. Existe uma verificação preliminar de possíveis problemas, que em outras linguagens, só seriam descobertos em tempo de execução.
- **Seguro:** Java é utilizado em ambientes de rede/distribuído. Desse modo, muito se trabalhou para a segurança, deixando a plataforma livre de vírus e adulterações.
- **Alto desempenho:** o código Java é convertido em bytecodes, esses bytecodes são interpretados em um ambiente de execução do Java para executá-los. Se for necessário mais desempenho, esse ambiente de execução transforma os bytecodes em código de máquina nativo para a CPU específica, ganhando assim desempenho.

Além dessas, pode-se citar duas outras características que foram determinantes para o sucesso: portabilidade e orientação a objetos.

## Portabilidade

Entende-se por portabilidade a capacidade de ser utilizado em qualquer plataforma, neste caso – sistema operacional (Windows, Linux, Mac OS) e hardware. Ou seja, Java é utilizado independente de plataforma.
Um programa Java gerado no ambiente Windows pode, facilmente, ser executado em Linux, sem nenhuma alteração no código.

Quando escreve-se código utilizando uma linguagem de programação é necessário a conversão desse código para um outro código, de modo que o computador seja capaz de executá-lo. Esse processo possui o nome de compilação, cujo significado é transformar o código fonte, que é mais fácil para os  desenvolvedores, em código de máquina, que é utilizado pelo computador.

Linguagens como C e Pascal são compiladas para um determinado sistema operacional e arquitetura de hardware, ou seja, após a compilação, o código executável (binário) roda somente para um tipo de sistema operacional. Se for necessário executar em outro ambiente, será preciso compilar o programa especificamente para esse ambiente.

Em algumas situações haverá necessidade de realizar ajustes no código, para o perfeito funcionamento em cada ambiente. Dessa forma, tem-se um código executável para cada sistema operacional. A linguagem Java é diferente. Existe uma máquina virtual, conhecida como JVM (Java Virtual Machine), que é capaz de interpretar (executar) os arquivos Java compilados.

A linguagem Java é compilada e interpretada. Primeiramente, os arquivos de código fonte Java com extensão `.java` são compilados para bytecodes, também conhecidos como arquivos de extensão `.class`. Após esse processo, os bytecodes são interpretados pela JVM, iniciando a execução do software. Para cada plataforma (sistema operacional + hardware) existe uma Máquina Virtual Java, tornando as aplicações Java portáveis.

Portanto, uma vez compilado, pode-se executar o programa independentemente da plataforma utilizada. Por exemplo, se está utilizando um ambiente com o sistema operacional Linux e o hardware da família x86 para desenvolver o programa, uma vez compilado, o programa pode ser executado em um ambiente Windows ou Mac OS, sem a necessidade de recompilar.