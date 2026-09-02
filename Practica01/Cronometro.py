import time, random;
class Cronometro:
    def __init__(self):
        self.inicia=time.time()*1000
        self.finaliza=0
    def getInicia(self):
        return self.inicia
    def getFinaliza(self):
        return self.finaliza
    def iniciaCronometro(self):
        self.inicia=time.time()*1000
    def detener(self):
        self.finaliza=time.time()*1000
    def lapsoDeTiempo(self):
        return self.finaliza-self.inicia
numeros=[0]*1000
for i in range(len(numeros)):
    numeros[i]=random.randint(0,99999)
c=Cronometro()
c.iniciaCronometro()
for i in range(len(numeros)- 1):
    menor=i 
    for j in range(i+1, len(numeros)):
        if numeros[j]<numeros[menor]:menor=j
    aux=numeros[i] 
    numeros[i]=numeros[menor] 
    numeros[menor]=aux
c.detener()
print("Tiempo: ",c.lapsoDeTiempo(), " milisegundos")