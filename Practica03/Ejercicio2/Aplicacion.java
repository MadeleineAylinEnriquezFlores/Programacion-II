public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinarNumero juego1 =new JuegoAdivinarNumero(3);
        JuegoAdivinaPar juego2 =new JuegoAdivinaPar(3);
        JuegoAdivinarImpar juego3 =new JuegoAdivinarImpar(3);
        juego1.juega();
        juego2.juega();
        juego3.juega();
    }
}