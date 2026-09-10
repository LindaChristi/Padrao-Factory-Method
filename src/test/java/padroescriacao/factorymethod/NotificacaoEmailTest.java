package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoEmailTest {

    @Test
    void deveEnviarEmail() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Email");
        assertEquals("E-mail Enviado", notificacao.enviar());
    }

    @Test
    void deveCancelarEmail() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Email");
        assertEquals("E-mail Cancelado", notificacao.cancelar());
    }

}