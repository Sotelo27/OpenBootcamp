'''
En este ejercicio tendréis que crear un módulo que contenga 
las operaciones básicas de una calculadora: sumar, restar, multiplicar y dividir.

Este módulo lo importaréis a un archivo python y llamaréis a las
 funciones creadas. Los resultados tenéis que mostrarlos por consola.
'''

import operaciones

def main():
    print(operaciones.suma(2,2))
    print(operaciones.resta(5,2))
    print(operaciones.multiplicar(2,10))
    print(operaciones.dividir(150,2))

main()
