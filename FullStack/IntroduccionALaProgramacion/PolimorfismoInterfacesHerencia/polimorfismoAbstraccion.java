package PolimorfismoInterfacesHerencia;

public class polimorfismoAbstraccion {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdadPersona(25);
        cliente.setNombrePersona("Julian");
        cliente.setTelefonoPersona(34552833);
        cliente.setCredito(100);
        System.out.println(cliente.getEdadPersona());
        System.out.println(cliente.getNombrePersona());
        System.out.println(cliente.getTelefonoPersona());
        System.out.println(cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setEdadPersona(25);
        trabajador.setNombrePersona("Pedro");
        trabajador.setTelefonoPersona(55678734);
        trabajador.setSalario(5000);
        System.out.println(trabajador.getEdadPersona());
        System.out.println(trabajador.getNombrePersona());
        System.out.println(trabajador.getTelefonoPersona());
        System.out.println(trabajador.getSalario());

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

class Cliente extends Persona {
    private int credito;

    public void setCredito(int cantidad){
        this.credito = cantidad;
    }

    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public void setSalario(int cantidad){
        this.salario = cantidad;
    }

    public int getSalario(){
        return this.salario;
    }
}

