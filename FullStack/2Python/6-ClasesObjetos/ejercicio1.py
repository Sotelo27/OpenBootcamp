'''
En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:

Color

Ruedas

Puertas

Por otro lado crearéis la clase Coche la cual heredará de Vehículo y 
tendrá los siguientes atributos:

Velocidad

Cilindrada

Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.
'''


class Vehiculo:
    _Color = "Rojo"
    _Ruedas = 4
    _Puertas = 5

class Coche(Vehiculo):
    _Velocidad = 500
    _Cilindrada = 200

coche = Coche()
print("Su coche posee una cantidad de {} ruedas , {} puertas , es de color {} , y va a una velocidad {} con {} cilindrada".format(coche._Ruedas,coche._Puertas,coche._Color,coche._Velocidad,coche._Cilindrada))