package padroescriacao.factorymethod;

public class NotificacaoEmail implements INotificacao {

    public String enviar() {
        return "E-mail Enviado";
    }

    public String cancelar() {
        return "E-mail Cancelado";
    }
}
