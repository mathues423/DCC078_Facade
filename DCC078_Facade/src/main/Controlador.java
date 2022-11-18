package main;

public class Controlador {
    public static boolean verificarAmbiente(Usuario usuario) {
        if (!IntegridadeRede.getIntegridade().verificaUsuario(usuario))
            if (!IntegridadeSistema.getIntegridade().verificaUsuario(usuario))
                return true;

        return false;
    }
}
