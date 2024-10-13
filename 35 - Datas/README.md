# 35. Datas

No Java, o tempo é medido em milissegundos a partir da data de referência 01/01/1970, que pode ser recuperada com o método `System.currentTimeMillis()`.

## 35.1. Classe Date

A classe `Date` representa um momento específico no tempo, incluindo ano, mês, dia, hora, minuto, entre outras informações. Atualmente, a maioria dos métodos dessa classe estão depreciados, pois foi substituída pela classe `Calendar` para fornecer um melhor suporte à internacionalização das datas.

Exemplo de uso da classe `Date`:

```
import java.util.Date;

public class TestaDate {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("Data Atual: " + data);
    }
}
```

## 35.2. Classe Calendar

A classe `Calendar` permite a manipulação e formatação de datas e horas para diferentes culturas e estilos de calendário. Como é uma classe abstrata, não pode ser instanciada diretamente; para obter uma instância, utiliza-se o método estático `getInstance()`.

Exemplo de uso da classe `Calendar`:

```
import java.util.Calendar;

public class DataCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Data e Hora Atual: " + c.getTime());
    }
}
```

Com `Calendar`, é possível extrair informações específicas como o dia, mês e ano:

```
import java.util.Calendar;

public class TestaMetodoGetCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + (c.get(Calendar.MONTH) + 1)); // Adiciona 1 pois começa em 0
        System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
    }
}
```

Para ajustar a data e hora, utiliza-se o método `set()`:

```
import java.util.Calendar;

public class TestaMetodosSetGetCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1995);
        c.set(Calendar.MONTH, Calendar.MARCH);
        c.set(Calendar.DAY_OF_MONTH, 20);

        System.out.println("Nova Data: " + c.getTime());
    }
}
```

É possível utilizar `Calendar` para personalizar mensagens baseadas no horário atual:

```
import java.util.Calendar;

public class MsgBoasVindasCalendar {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        int hora = c1.get(Calendar.HOUR_OF_DAY);

        if (hora >= 6 && hora < 12) {
            System.out.println("Bom Dia");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa Noite");
        }
    }
}
```

Esses exemplos demonstram as principais funcionalidades da classe `Calendar` para manipulação e exibição de datas e horários, oferecendo maior flexibilidade e suporte para operações internacionais.

## 35.3. Classe DateFormat

A classe `DateFormat` permite converter objetos `String` para `Date` e vice-versa, aplicando formatos específicos. Como é uma classe abstrata, utiliza-se o método estático `getDateInstance()` para instanciá-la. Para usar a classe, é necessário importar o pacote `java.text`.

O código abaixo demonstra como formatar uma data usando diferentes métodos de `DateFormat`:

```
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;

public class FormatandoDatas {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2013, Calendar.FEBRUARY, 28);
        Date data = c.getTime();
        System.out.println("Data atual sem formatação: " + data);

        // Formata a data
        DateFormat formataData = DateFormat.getDateInstance();
        System.out.println("Data atual com formatação: " + formataData.format(data));

        // Formata a hora
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println("Hora formatada: " + hora.format(data));

        // Formata data e hora
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        System.out.println(dtHora.format(data));
    }
}
```

A classe `DateFormat` fornece níveis de detalhamento para a formatação de data, como `FULL`, `LONG`, `MEDIUM` e `SHORT`.

```
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;

public class FormatandoSaidaDatas {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();

        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data completa: " + f.format(data));

        f = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Data sem o dia: " + f.format(data));

        f = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data resumida 1: " + f.format(data));

        f = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Data resumida 2: " + f.format(data));
    }
}
```

1. `FULL`:

- **Descrição:** Exibe a data de forma completa, com o máximo de detalhes, incluindo o dia da semana, mês por extenso, dia do mês, ano e, se necessário, a hora com fuso horário.
- **Exemplo (Brasil):** terça-feira, 1 de janeiro de 2024.
- **Usos:** Indicada para contextos formais, onde se deseja apresentar a data por extenso, como documentos oficiais.

2. `LONG`:

- **Descrição:** Exibe a data de forma detalhada, mas com menos informações do que o formato `FULL`. Inclui o mês por extenso, o dia e o ano, mas geralmente omite o dia da semana e o fuso horário.
- **Exemplo (Brasil):** 1 de janeiro de 2024.
- **Usos:** Comum em contextos que precisam de uma representação mais legível que o `MEDIUM` ou `SHORT`, mas sem os detalhes do `FULL`.

3. `MEDIUM`:

- **Descrição:** Exibe a data de maneira resumida, com o mês em forma abreviada e sem o dia da semana. Geralmente, mostra o mês com três letras e o ano em quatro dígitos.
- **Exemplo (Brasil):** 1 de jan. de 2024.
- **Usos:** Usado em relatórios e interfaces de usuário, onde é necessária uma data abreviada, mas ainda legível.

4. `SHORT`:

- **Descrição:** Exibe a data de maneira extremamente abreviada, usando apenas números para o dia, mês e ano.
- **Exemplo (Brasil):** 01/01/2024.
- **Usos:** Comum em sistemas onde o espaço é limitado, como tabelas e bancos de dados, ou quando a data precisa ser rapidamente reconhecível e interpretada.

## 35.4. Conversão de Datas com SimpleDateFormat

Para conversões mais personalizadas, utiliza-se a classe `SimpleDateFormat`, que permite especificar o padrão de formatação no construtor. O método `parse` permite converter `String` para `Date`, e `format` converte `Date` para `String`.

```
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class ConversaoDatas {
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data formatada: " + sdf.format(data));
        
        // Conversão de String para Date
        Date data2 = sdf.parse("12/01/1995");
        System.out.println("Data convertida: " + data2);
    }
}
```

## 35.5. Internacionalização com Locale

O Java permite adaptar a formatação de datas a diferentes locais através da classe `Locale`. O exemplo a seguir demonstra como formatar uma data para o Brasil, EUA e Itália:

```
import java.util.Calendar;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Date;

public class LocaleDatas {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();

        Locale brasil = new Locale("pt", "BR");
        Locale eua = Locale.US;
        Locale italia = Locale.ITALY;

        DateFormat f1 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        System.out.println("Data brasileira: " + f1.format(data));

        DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, eua);
        System.out.println("Data americana: " + f2.format(data));

        DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, italia);
        System.out.println("Data italiana: " + f3.format(data));
    }
}
```

Esses exemplos mostram como manipular e formatar datas no Java, permitindo diversas configurações e suporte à internacionalização.