import java.util.HashMap;

public class HashMapRemove {
    public static void main(String[] args) {
       HashMap<String, String> mapa = new HashMap<>();
        mapa.put("RM1234", "Antônio");
        mapa.put("RM4321", "José");
        mapa.remove("RM4321");
        System.out.println(mapa);
    }
}