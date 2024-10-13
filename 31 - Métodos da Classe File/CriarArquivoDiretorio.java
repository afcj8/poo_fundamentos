import java.io.File;
import java.io.IOException;

public class CriarArquivoDiretorio {
    public static void main(String[] args) {
        File diretorio = new File("meu_diretorio");
        if (!diretorio.exists()) {
            diretorio.mkdir();
        }

        File arquivo = new File(diretorio, "file.txt");
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado!"); 
            }else {
                System.out.println("Arquivo não criado!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}