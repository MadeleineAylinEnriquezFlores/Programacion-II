from Sensor import Sensor
class SensorLuzLaser(Sensor):
    tipo="Luz Laser"
    def __init__(self,alcance,**kwargs):
        super().__init__(**kwargs)
        self.alcance=alcance