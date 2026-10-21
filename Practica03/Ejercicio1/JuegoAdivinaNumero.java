import java.util.*;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    public void juega() {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        reiniciaPartida();
        numeroAAdivinar = aleatorio.nextInt(11);
        System.out.println("Adivina un numero entre 0 y 10:");
        while (true) {
            int numero = leer.nextInt();
            if (numero == numeroAAdivinar) {
                System.out.println("Acertaste!!");
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
                    System.out.println("Ya no tienes vidas");
                    return;
                }
            }
        }
    }
}