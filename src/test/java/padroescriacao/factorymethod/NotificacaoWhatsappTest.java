package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoWhatsappTest {

    @Test
    void deveEnviarWhatsapp() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Whatsapp");
        assertEquals("Mensagem Enviada", notificacao.enviar());
    }

    @Test
    void deveCancelarWhatsapp() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Whatsapp");
        assertEquals("Mensagem Cancelada", notificacao.cancelar());
    }

}