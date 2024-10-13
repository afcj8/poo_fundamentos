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