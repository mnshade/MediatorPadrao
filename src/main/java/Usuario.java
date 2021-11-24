public abstract class Usuario {

    protected MediadorChat mediador;
    protected String nome;

    public Usuario(MediadorChat mediador, String nome) {
        this.mediador = mediador;
        this.nome = nome;
    }

    public abstract void enviar(String mensagem);

    public abstract void receber(String mensagem);
}
