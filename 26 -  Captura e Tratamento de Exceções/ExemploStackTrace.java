public class ExemploStackTrace {
    public static void main(String[] args) {
        int[] array = new int[2];
        try {
            array[2] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Mensagem de erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}