public class NavegadorWeb implements Dispositivo {
    @Override
    public void Ligado() {
        System.out.println("Navegador Ligado..");
    }

    @Override
    public void Desligado() {
        System.out.println("Navegador Desligado.");
    }

    public void exibirPagina() {
        System.out.println("Mostrando Pagina.");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Pagina.");
    }
}