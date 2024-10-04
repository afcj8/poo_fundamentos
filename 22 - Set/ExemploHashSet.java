import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<String> cursos = new HashSet<>();
        cursos.add("Java");
        cursos.add(".NET");
        cursos.add("Android");
        cursos.add("Java");  // elemento repetido
        System.out.println(cursos);
    }
}