public class TesteEnum {
    public static void main(String[] args) {

        DiaDaSemana hoje = DiaDaSemana.QUARTA;
        
        if (hoje == DiaDaSemana.SEGUNDA) {
            System.out.println("Hoje é SEGUNDA");
        } else {
            System.out.println("Hoje não é SEGUNDA");
        }

        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia);
        }
    }
}