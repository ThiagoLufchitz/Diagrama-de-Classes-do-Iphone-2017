public class Telefone implements Dispositivo {
    @Override
    public void Ligado() {
        System.out.println("Telefone Ligado");
    }

    @Override
    public void Desligado() {
        System.out.println("Telefone Desligado");
    }

    public void ligando() {
        System.out.println("Fazendo a Ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Ligando para Correio de Voz");
    }

    public void atender() {
        System.out.println("Atendendo a Ligação");
    }
}