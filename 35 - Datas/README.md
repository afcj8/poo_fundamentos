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