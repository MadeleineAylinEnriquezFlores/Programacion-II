class EcuacionLineal:
    def __init__(self,a,b,c,d,e,f):
        self.__a=a
        self.__b=b
        self.__c=c
        self.__d=d
        self.__e=e
        self.__f=f
    def tieneSolucion(self):
        return self.__a*self.__d -self.__b*self.__c!=0
    def getX(self):
        return (self.__e*self.__d-self.__b*self.__f)/(self.__a*self.__d-self.__b*self.__c)
    def getY(self):
        return (self.__a*self.__f-self.__e*self.__c)/(self.__a*self.__d-self.__b*self.__c)
a=float(input("Ingrese a: "))
b=float(input("Ingrese b: "))
c=float(input("Ingrese c: "))
d=float(input("Ingrese d: "))
e=float(input("Ingrese e: "))
f=float(input("Ingrese f: "))
ecuacion=EcuacionLineal(a,b,c,d,e,f)
if ecuacion.tieneSolucion():
    print("x es: ",ecuacion.getX())
    print("y es: ",ecuacion.getY())
else:
    print("No hay solucion")
    
