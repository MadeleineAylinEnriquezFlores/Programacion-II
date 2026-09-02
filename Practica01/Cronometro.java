public class Cronometro{
  private long inicia,finaliza;
  public Cronometro(){
    inicia=System.currentTimeMillis();
  }
  public long getInicia() {
        return inicia;
  }
  public long getFinaliza() {
        return finaliza;
  }
  public void inicia() {
        inicia=System.currentTimeMillis();
  }
  public void detener() {
        finaliza=System.currentTimeMillis();
  }
  public long lapsoDeTiempo() {
        return finaliza-inicia;
  }
    public static void main(String[] args) {
      int[] numeros=new int[100000];
      for (int i=0; i<numeros.length; i++) {
            numeros[i]=(int)(Math.random()*100000);
      }
      Cronometro c=new Cronometro();
      c.inicia();
      for (int i=0; i<numeros.length-1;i++) {
            int menor=i;
            for (int j=i+1; j<numeros.length; j++) {
                if (numeros[j]<numeros[menor]) {
                    menor=j;
                }
            }
            int aux=numeros[i];
            numeros[i]=numeros[menor];
            numeros[menor]=aux;
      }
      c.detener();
      System.out.println("Tiempo: "+c.lapsoDeTiempo()+" milisegundos");
    }
    }