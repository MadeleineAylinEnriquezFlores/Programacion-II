public class MiPunto {
    private double x;
    private double y;
    public MiPunto(){
        this.x=0;
        this.y=0;
    }
    public MiPunto(double x,double y){
        this.x=x;
        this.y=y;
    }    
    public double getX(){
        return x;
    } 
    public double getY(){
        return y;
    } 
    public double distancia(MiPunto p){
        double dx=this.x-p.x;
        double dy=this.y-p.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public double distancia(double x,double y){
        double dx=this.x-x;
        double dy=this.y-y;
        return Math.sqrt(dx*dx+dy*dy);
        }
    public static void main(String[] args) {
        MiPunto p1=new MiPunto();
        MiPunto p2=new MiPunto(10,30.5);
        System.out.println("distancia = "+p1.distancia(p2));
    }
}