import java.util.*;
public class Estadistica {
    private double[] num;
    private int x;
    public Estadistica(int x) {
        this.x=x;
        num=new double[x];
    }
    public void llenar(java.util.Scanner leer) {
        for (int i = 0; i < x; i++) {
            System.out.println("Ingresar numero: ");
            num[i]=leer.nextDouble();
        }
    }
    public double promedio() {
        double suma=0;
        for (int i = 0; i < x; i++) {
            suma=suma+num[i];
        }
        return suma/x;
    }
    public double desviacion() {
        double prom=promedio();
        double suma=0;
        for (int i = 0; i < x; i++) {
            suma=suma+Math.pow(num[i]-prom, 2);
        }
        return Math.sqrt(suma/(x-1));
    }
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int x;
        do {
            System.out.println(
                "Ingresar la cantidad de numeros que desea ingresar (minimo 10): "
            );
            x = leer.nextInt();
        } while (x < 10);
        Estadistica e=new Estadistica(x);
        e.llenar(leer);
        System.out.println("Promedio: " + e.promedio());
        System.out.println("Desviacion: " + e.desviacion());
    }
}
