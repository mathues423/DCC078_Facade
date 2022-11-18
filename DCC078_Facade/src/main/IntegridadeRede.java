package main;

public class IntegridadeRede extends CodEspace{
    private static IntegridadeRede rede = new IntegridadeRede();

    private IntegridadeRede() {};

    public static IntegridadeRede getIntegridade() {
        return rede;
    }
}
