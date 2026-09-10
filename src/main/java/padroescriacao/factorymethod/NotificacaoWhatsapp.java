package padroescriacao.factorymethod;

public class NotificacaoWhatsapp implements INotificacao {

    public String enviar() {
        return "Mensagem Enviada";
    }

    public String cancelar() {
        return "Mensagem Cancelada";
    }
}
