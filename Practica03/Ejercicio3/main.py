from VehiculoAutonomo import VehiculoAutonomo
vehiculo = VehiculoAutonomo("V01098", "4K", 100)
print(vehiculo.tipo)
print(vehiculo.id)
print(vehiculo.encendido)
print(vehiculo.resolucion)
print(vehiculo.alcance)

vehiculo.activar()

print(vehiculo.encendido)
vehiculo.desactivar()

print(vehiculo.encendido)
