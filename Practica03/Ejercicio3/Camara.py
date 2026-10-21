from Sensor import Sensor
class Camara(Sensor):
    tipo="Camara"
    def __init__(self,resolucion,**kwargs):
        super().__init__(**kwargs)
        self.resolucion=resolucion