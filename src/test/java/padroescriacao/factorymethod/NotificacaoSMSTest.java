package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoSMSTest {

    @Test
    void deveEnviarSMS() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("SMS");
        assertEquals("SMS Enviado", notificacao.enviar());
    }

    @Test
    void deveCancelarSMS() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("SMS");
        assertEquals("SMS Cancelado", notificacao.cancelar());
    }

}