import math
class AlgebraVectorial:
    def __init__(self, a1=0,a2=0,a3=0):
        self.__a1=a1
        self.__a2=a2
        self.__a3=a3
    def __add__(self, b):
        return AlgebraVectorial(self.__a1+b.__a1,self.__a2+b.__a2,self.__a3+b.__a3)
    def __mul__(self, r):
        return AlgebraVectorial(self.__a1*r,self.__a2*r,self.__a3*r)
    def longitud(self):
        return math.sqrt(self.__a1**2+self.__a2**2+self.__a3**2)
    def normal(self):
        l=self.longitud()
        return AlgebraVectorial(self.__a1/l,self.__a2/l,self.__a3/l)
    def productoEscalar(self, b):
        return self.__a1*b.__a1+self.__a2*b.__a2+self.__a3*b.__a3
    def productoVectorial(self, b):
        a1=self.__a2*b.__a3-self.__a3*b.__a2
        a2=self.__a3*b.__a1-self.__a1*b.__a3
        a3=self.__a1*b.__a2-self.__a2*b.__a1
        return AlgebraVectorial(a1,a2,a3)
    def perpendicular(self, b):
        return self.productoEscalar(b)==0
    def paralela(self, b):
        p=self.productoVectorial(b)
        return p.__a1==0 and p.__a2==0 and p.__a3==0
    def proyeccion(self, b):
        producto=self.productoEscalar(b)
        modulo=b.longitud()**2
        return b*(producto/modulo)
    def componente(self, b):
        return self.productoEscalar(b)/b.longitud()
    def __str__(self):
        return "("+str(self.__a1)+", "+str(self.__a2)+", "+str(self.__a3)+")"
a=AlgebraVectorial(1,2,3)
b=AlgebraVectorial(4,5,6)
print("vector a =",a)
print("vector b =",b)
print("suma de a+b =",a+b)
print("Escalar 5 por vector a =",a*5)
print("Longitud de a =",a.longitud())
print("Normal de a =",a.normal())
print("Producto escalar =",a.productoEscalar(b))
print("Producto vectorial =",a.productoVectorial(b))
print("Perpendiculares =",a.perpendicular(b))
print("Paralelos =",a.paralela(b))
print("Proyeccion de a sobre b =",a.proyeccion(b))
print("Componente de a en b =",a.componente(b))