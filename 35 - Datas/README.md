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