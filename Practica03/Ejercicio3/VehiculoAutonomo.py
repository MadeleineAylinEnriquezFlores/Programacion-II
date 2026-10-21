from Camara import Camara
from SensorLuzLaser import SensorLuzLaser
class VehiculoAutonomo(Camara,SensorLuzLaser):
    tipo="Vehiculo Autonomo"
    def __init__(self,id,resolucion,alcance):
        super().__init__(id=id, resolucion=resolucion,alcance=alcance)