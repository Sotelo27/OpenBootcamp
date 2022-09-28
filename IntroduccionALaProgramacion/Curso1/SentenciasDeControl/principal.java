package Curso1.SentenciasDeControl;

/*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, 
el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable 
tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, 
se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y 
distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se 
deberá mandar un mensaje por consola informando de la estación en la que está. 
También habrá que poner un default para cuando el valor de la variable no sea una estación. */

public class principal {
    public static void main(String[] args) {
        int numero = -5;
        if (numero < 0){
            System.out.println("Es Negativo");
        }
        else{
            if (numero > 0){
                System.out.println("Es positivo");
            }
            else{
                System.out.println("Es Neutro");
            }
        }
        int numeroWhile = -5;
        while (numeroWhile < 3){
            System.out.println("\nEl valor es: ");
            System.out.println(numeroWhile);
            numeroWhile += 1;
        }
        numeroWhile = 2;
        do {
            numeroWhile += 1;
            System.out.println("\nEl valor es: ");
            System.out.println(numeroWhile);
        }while (numeroWhile < 3);

        for (int numeroFor = 0;numeroFor <=3;numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion = "Verano";
        switch (estacion){
            case "Verano":
            System.out.println("Estas en Verano.");
            break;
            case "Primavera":
            System.out.println("Estas en Primavera.");
            break;
            case "Otonio":
            System.out.println("Estas en Otonio.");
            break;
            case "Invierno":
            System.out.println("Estas en Invierno.");
            break;
            default:
            System.out.println("No es una estacion.");
        }
    }
}
