import java.util.*;

public class JuegoAdivinarNumero extends Juego {
    private int numeroAAdivinar;
    public JuegoAdivinarNumero(int numeroDeVidas) {
        super(numeroDeVidas);
        this.numeroAAdivinar=numeroAAdivinar;
    }
    public void juega() {
        Scanner leer = new Scanner(System.in);
        reiniciaPartida();
        Random aleatorio=new Random();
        numeroAAdivinar=aleatorio.nextInt(11);
        System.out.println("Adivina un numero entre 0 y 10:");
        while (true) {
            int numero=leer.nextInt();
            if (numero==numeroAAdivinar) {
                System.out.println("Ganaste!");
                actualizaRecord();
                return;
            } else {
                if (quitaVida()) {
                    if (numeroAAdivinar > numero) {
                        System.out.println("El numero a adivinar es mayor");
                    } else {
                        System.out.println("El numero a adivinar es menor");
                    }
                    System.out.println("Intenta de nuevo:");
                } else {
                    System.out.println("Perdiste :()");
                    System.out.println("El numero era: "+numeroAAdivinar);
                    return;
                }
            }
        }
    }
    public boolean validaNumero(int numero) {
        if (numero<11 && numero>=0) return true;
        else return false;
        }
}