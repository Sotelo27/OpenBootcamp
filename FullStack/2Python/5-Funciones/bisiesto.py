#Escribe una función que pueda decirte si un año (número entero) es bisiesto o no.

def definirBisiesto(anio):
    bisiesto = False
    if (anio %4 == 0 and anio % 100 != 0) or (anio%4 == 0 and anio%100==anio%400==0):
        bisiesto = True
    return bisiesto

def main():
    anio = int(input("Ingrese el anio a continuacion: "))
    bisiesto = definirBisiesto(anio)
    if bisiesto == False:
        print("No es bisiesto")
    else:
        print("Es bisiesto")

main()