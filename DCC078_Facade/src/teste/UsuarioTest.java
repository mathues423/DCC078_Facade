package teste;

import main.IntegridadeRede;
import main.IntegridadeSistema;
import main.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveRetornarPendenciaIntegridadeSistema() {
        Usuario usuario = new Usuario("198.165.12.1");
        IntegridadeSistema.getIntegridade().addUsuario(usuario);
        assertEquals(false, usuario.verificar());
    }

    @Test
    void deveRetornarPendenciaIntegridadeRede() {
        Usuario usuario = new Usuario("198.165.12.1");
        IntegridadeRede.getIntegridade().addUsuario(usuario);
        assertEquals(false, usuario.verificar());
    }

    @Test
    void caminhoFeliz() {
        Usuario usuario = new Usuario("198.165.12.1");

        assertEquals(true, usuario.verificar());
    }

}