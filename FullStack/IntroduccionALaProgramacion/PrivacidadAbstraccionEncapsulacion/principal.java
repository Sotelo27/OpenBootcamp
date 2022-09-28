package PrivacidadAbstraccionEncapsulacion;

public class principal {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        coche.setTipoVehiculo("Coche");
        String tipo = coche.getTipoVehiculo();
        Vehiculo moto = new Vehiculo();
        moto.setTipoVehiculo("Moto");
        System.out.println(tipo);
        coche.setVelocidadMaxima((300));
        System.out.println(coche.getVelocidadMaxima());
        moto.setVelocidadMaxima(500);
        System.out.println(moto.getTipoVehiculo());
        System.out.println(moto.getVelocidadMaxima());
    } 
}
class Vehiculo{
    private String tipoVehiculo;
    private int velocidadMaxima;

    public void setTipoVehiculo(String tipo){
        this.tipoVehiculo = tipo;
    }
    
    public String getTipoVehiculo(){
        return this.tipoVehiculo;
    }

    public void setVelocidadMaxima(int velocidad){
        this.velocidadMaxima = velocidad;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }
}
