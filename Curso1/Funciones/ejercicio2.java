package Curso1.Funciones;

public class ejercicio2 {
    public static void main(String[] args) {
        coche miAuto = new coche();
        miAuto.agregarPuertas(4);
        System.out.println(miAuto.puertas);   
    }
}
class coche {
    int puertas = 4;
    public void agregarPuertas(int cantidad){
        this.puertas = puertas + cantidad;
    }
}