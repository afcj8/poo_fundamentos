import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("RM1234", "Antônio");
        mapa.put("RM4321", "José");
        System.out.println(mapa);
    }
}