package main;

public class Usuario {
    private boolean integridade_rede;
    private String IP;

    public Usuario(String IP) {
        this.IP = IP;
        this.integridade_rede = verificarRede();
    }

    public boolean verificar(){
        return Controlador.verificarAmbiente(this);
    }

    public String getIP() {
        return IP;
    }
    private boolean verificarRede(){
        return true;
    }
}
