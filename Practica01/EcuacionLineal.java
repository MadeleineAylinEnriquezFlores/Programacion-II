import java.util.*;
public class EcuacionLineal{
    private double a,b,c,d,e,f;
    public EcuacionLineal(double a,double b,double c,double d,double e,double f) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    public boolean tieneSolucion() {
        return a*d-b*c!=0;
    }
    public double getX() {
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY() {
        return (a*f-e*c)/(a*d-b*c);
    }
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double a,b,c,d,e,f;
        System.out.print("Ingrese a: ");
        a=leer.nextDouble();
        System.out.print("Ingrese b: ");
        b=leer.nextDouble();
        System.out.print("Ingrese c: ");
        c=leer.nextDouble();
        System.out.print("Ingrese d: ");
        d=leer.nextDouble();
        System.out.print("Ingrese e: ");
        e=leer.nextDouble();
        System.out.print("Ingrese f: ");
        f=leer.nextDouble();
        EcuacionLineal ecuacion=new EcuacionLineal(a, b, c, d, e, f);
        if (ecuacion.tieneSolucion()) {
            System.out.println("x es: "+ecuacion.getX());
            System.out.println("y es: "+ecuacion.getY());
        }else {
            System.out.println("No hay solucion");
        }
    } 
    }

