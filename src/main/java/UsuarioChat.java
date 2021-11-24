public class UsuarioChat extends Usuario {

    public UsuarioChat(MediadorChat mediador, String nome) {
        super(mediador, nome);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println(nome + " enviou: " + mensagem);
        mediador.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
