public class Usuario implements Autenticavel {
    private String usuario;
    private String senha;
    private boolean logado;

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public boolean login(String usuario, String senha) {
        if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
            logado = true;
            return true;
        }
        return false;
    }

    @Override
    public void logou() {
        System.out.println("Usuário logado com sucesso!");
    }

    @Override
    public void deslogar() {
        logado = false;
    }

    @Override
    public boolean isLogado() {
        return logado;
    }
}