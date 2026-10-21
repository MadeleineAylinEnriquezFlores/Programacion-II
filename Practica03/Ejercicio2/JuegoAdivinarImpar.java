public class JuegoAdivinarImpar extends JuegoAdivinarNumero {

    public JuegoAdivinarImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10 && numero % 2 != 0)
            return true;
        else {
            System.out.println("Error: el numero debe ser impar.");
            return false;
        }
    }
}