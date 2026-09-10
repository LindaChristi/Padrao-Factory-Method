package padroescriacao.factorymethod;

public class NotificacaoSMS implements INotificacao {

    public String enviar() {
        return "SMS Enviado";
    }

    public String cancelar() {
        return "SMS Cancelado";
    }
}
