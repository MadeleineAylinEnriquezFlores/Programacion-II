import java.util.*;
public class EstadisticaProgEstructurada {
    public static void llenar(int x, double num[] ,Scanner leer){
        for (int i = 0; i < x; i++) {
            System.out.println("Ingresar numero: ");
            num[i]=leer.nextDouble();
        }
    }
    public static double promedio(int x,double num[] ){
        double suma=0;
        for (int i = 0; i < x; i++) {
            suma=suma+num[i];
        }
        return suma/x;
    }
    public static double desviacion(int x, double num[]) {
    double prom=promedio(x, num);
    double suma=0;
    for (int i = 0; i < x; i++) {
        suma = suma + Math.pow(num[i] - prom, 2);
    }
    return Math.sqrt(suma / (x - 1));
}
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int x;
        double y,z;
        double [] num=new double[1000];
        do{
        System.out.println("Ingresar la cantidad de numeros que desea ingresar(minimo 10): ");
        x=leer.nextInt();
        }while (x<10);
    llenar(x,num,leer);
    y=promedio(x,num);
    z=desviacion(x, num);
    System.out.println("Promedio: "+y);
    System.out.println("Desviacion: "+z);
}
} 