import java.io.File;
import java.io.IOException;

public class ManipulaArquivo {
    public static void main(String[] args) {
        File arquivo = new File("arquivo.txt");

        if (arquivo.exists()) {
            System.out.println("O arquivo existe!" +
                "\nPode ser lido: " + arquivo.canRead() +
                "\nPode ser gravado: " + arquivo.canWrite() +
                "\nTamanho: " + arquivo.length() +
                "\nCaminho: " + arquivo.getPath());
        } else {
            try {
                if (arquivo.createNewFile())
                    System.out.println("Arquivo criado!");
                else
                    System.out.println("Arquivo não criado!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}