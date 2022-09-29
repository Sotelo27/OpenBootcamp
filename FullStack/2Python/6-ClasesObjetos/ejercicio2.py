'''
En este segundo ejercicio, tendréis que 
crear un programa que tenga una clase llamada Alumno que tenga como atributos 
su nombre y su nota. Deberéis de definir los métodos para inicializar sus atributos, 
imprimirlos y mostrar un mensaje con el resultado de la nota y si ha aprobado o no.
'''

class Alumno:
    _nombre = ""
    _nota = 0

    def definirNombre(self,nombre):
        self._nombre = nombre

    def definirNota(self,nota):
        self._nota = nota


alumno1 = Alumno()
alumno1.definirNombre("Jose")
alumno1.definirNota(7)
print(alumno1._nombre)
print(alumno1._nota)
if (alumno1._nota > 6):
    print("Aprobo")
else:
    print("Desaprobo")