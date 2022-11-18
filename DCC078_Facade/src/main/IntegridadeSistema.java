package main;

public class IntegridadeSistema extends CodEspace{
    private static IntegridadeSistema sistema = new IntegridadeSistema();

    private IntegridadeSistema() {};

    public static IntegridadeSistema getIntegridade() {
        return sistema;
    }
}
