import padroescriacao.factorymethod.INotificacao;
import padroescriacao.factorymethod.NotificacaoFactory;

public class Aplicacao {

    public static void main(String[] args) {

        INotificacao email = NotificacaoFactory.obterNotificacao("Email");
        INotificacao sms = NotificacaoFactory.obterNotificacao("SMS");
        INotificacao whatsapp = NotificacaoFactory.obterNotificacao("Whatsapp");

        System.out.println(email.enviar());
        System.out.println(sms.enviar());
        System.out.println(whatsapp.enviar());
    }
}