class Sensor:
    tipo="Generico"
    def __init__(self,id,**kwargs):
            super().__init__(**kwargs)
            self.id=id
            self.encendido=False
    def activar(self):
          self.encendido=True
    def desactivar(self):
              self.encendido=False