
import java.io.File;

public class ManipulaDiretorio {
    public static void main(String[] args) {
        File diretorio = new File("meu_diretorio");

        if (diretorio.exists()) {
            System.out.println("Diretório existe!");
        } else {
            if (diretorio.mkdir()) {
                System.out.println("Diretório criado!"); 
            }else {
                System.out.println("Diretório não criado.");
            }
        }
    }
}