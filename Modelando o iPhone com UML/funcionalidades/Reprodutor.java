public class Reprodutor {
    public class MusicPlayer implements Dispositivo {
        @Override
        public void Ligado() {
            System.out.println("O Reprodutor de Musica esta Ligado.");
        }

        @Override
        public void Desligado() {
            System.out.println("O Reprodutor de Musica esta Deligado.");
        }

        public void tocar() {
            System.out.println("Tocando Musica.");
        }

        public void pausar() {
            System.out.println("Musica Pausada.");
        }

        public void selecionarMusica() {
            System.out.println("Escolhendo Musica.");
        }

    }
}
