package PrivacidadAbstraccionEncapsulacion;
/*
 * Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, 
nombre y telefono, por último muéstralas por consola.
 */

public class ejercicio {
    public static void main(String[] args) {
        Persona humano = new Persona();
        humano.setEdadPersona(25);
        humano.setNombrePersona("Tarkus");
        humano.setTelefonoPersona(34552833);
        System.out.println(humano.getEdadPersona());
        System.out.println(humano.getNombrePersona());
        System.out.println(humano.getTelefonoPersona());
    }

}

class Persona{
    private int edadPersona;
    private String nombrePersona;
    private int telefonoPersona;

    public void setEdadPersona(int edad){
        this.edadPersona = edad;
    }
    public void setNombrePersona (String nombre){
        this.nombrePersona = nombre;
    }
    public void setTelefonoPersona (int telefono){
        this.telefonoPersona = telefono;
    }
    public int getEdadPersona(){
        return this.edadPersona;
    }
    public String getNombrePersona(){
        return this.nombrePersona;
    }
    public int getTelefonoPersona(){
        return this.telefonoPersona;
    }
}
