package PolimorfismoInterfacesHerencia;

public class principal {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.matricula = "E3DE";
        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.matricula = "4T9EE";
        System.out.println(coche.comprobarMatricula());
        System.out.println(cocheElectrico.comprobarMatricula());

    } 
}

class Vehiculo{
    private String tipoVehiculo;
    private int velocidadMaxima;
    String matricula;


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

    public boolean comprobarMatricula (){
        int contador ;
        for (contador = 0; contador < matricula.length() ; contador ++){
        }
        if (contador == 4){
            return true;
        }
        return false;
    }
}

interface AutoMovil{
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Moto implements AutoMovil{
    public void Acelerar(int cuantaVelocidad){

    }

    public void Frenar(int cuantaVelocidad){

    }
}

class Coche extends Vehiculo{}

class CocheElectrico extends Vehiculo{}

