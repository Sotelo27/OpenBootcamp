class Vehiculo:
    _encendido = True

    def __init__(self):
        print("Constructor")

    def enciende(self):
        self._encendido = True

    def apaga(self):
        self._encendido = False
    
    def isEncendido(self):
        return self._encendido

d = Vehiculo()
d.apaga()
print(d.isEncendido())

class Motor:
    tipo = "Diesel"

class Ventanas:
    cantidad = 5

class Ruedas:
    cantidad = 4

class Carroceria:
    ventanas = Ventanas()
    ruedas = Ruedas()

class Coche:
    motor = Motor()
    carroceria = Carroceria()


coche1 = Coche()
print("Motor es:",coche1.motor.tipo)
print("Ventanas:",coche1.carroceria.ventanas.cantidad)

