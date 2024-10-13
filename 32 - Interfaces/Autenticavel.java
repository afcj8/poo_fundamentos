public interface Autenticavel {
    boolean login(String usuario, String senha);
    void logou();
    void deslogar();
    boolean isLogado();
}