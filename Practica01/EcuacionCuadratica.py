import math
class EcuacionCuadratica:
    def __init__(self,a,b,c):
        self.__a=a
        self.__b=b
        self.__c=c
    def getDiscriminante(self):
        return self.__b*self.__b -4*self.__a*self.__c
    def getRaiz1(self):
        return (-self.__b+math.sqrt(self.__b*self.__b-4*self.__a*self.__c))/(2*self.__a)
    def getRaiz2(self):
        return (-self.__b-math.sqrt(self.__b*self.__b-4*self.__a*self.__c))/(2*self.__a)
    def getRaizunica(self):
            return -self.__b/(2*self.__a)
a=float(input("Ingrese a: "))
b=float(input("Ingrese b: "))
c=float(input("Ingrese c: "))
ecuacion=EcuacionCuadratica(a,b,c)
if ecuacion.getDiscriminante()>0 :
    print("raiz 1 es: ",ecuacion.getRaiz1())
    print("raiz 2 es: ",ecuacion.getRaiz2())
elif ecuacion.getDiscriminante()==0:
    print("raiz unica es: ",ecuacion.getRaizunica())
else:
    print("No existe solucion")
    
