public class Juego {
    private int numeroDeVidas;
    private int record;
    public Juego(int numeroDeVidas) {
        this.numeroDeVidas=numeroDeVidas;
        this.record=0;
    }
    public void reiniciaPartida() {
        numeroDeVidas=3;
    }

    public void actualizaRecord() {
        record=numeroDeVidas;
        System.out.println("Nuevo record: "+record);
    }

    public boolean quitaVida() {
        numeroDeVidas=numeroDeVidas-1;
        if (numeroDeVidas>0) {
            return true;
        } else{
            return false;
        }
    }

}