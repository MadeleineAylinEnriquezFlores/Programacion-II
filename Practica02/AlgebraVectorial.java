public class AlgebraVectorial {
    private double x;
    private double y;
    public AlgebraVectorial() {
        this.x=0;
        this.y=0;
    }
    public AlgebraVectorial(double x,double y) {
        this.x=x;
        this.y=y;
    }
    public boolean perpendicular(AlgebraVectorial b) {
        return x*b.x+y*b.y==0;
    }
    public boolean perpendicular(double x,double y) {
        return this.x*x+this.y*y==0;
    }
    public boolean paralela(AlgebraVectorial b) {
        return x*b.y-y*b.x==0;
    }
    public boolean paralela(double x,double y) {
        return this.x*y-this.y*x==0;
    }
    public AlgebraVectorial proyeccion(AlgebraVectorial b) {
        double producto=x*b.x+y*b.y;
        double modulo=b.x*b.x+b.y*b.y;
        double px=(producto/modulo)*b.x;
        double py=(producto/modulo)*b.y;
        return new AlgebraVectorial(px,py);
    }
    public double componente(AlgebraVectorial b) {
        double producto=x*b.x+y*b.y;
        double modulo=Math.sqrt(b.x*b.x+b.y*b.y);
        return producto/modulo;
    }

    public static void main(String[] args) {
        AlgebraVectorial a=new AlgebraVectorial(2,3);
        AlgebraVectorial b=new AlgebraVectorial(3,-2);
        System.out.println("Perpendiculares: "+a.perpendicular(b));
        System.out.println("Paralelos: "+a.paralela(b));
        AlgebraVectorial p=a.proyeccion(b);
        System.out.println("Proyeccion: ("+p.x+", "+p.y+")");
        System.out.println("Componente: "+a.componente(b));
    }
}
