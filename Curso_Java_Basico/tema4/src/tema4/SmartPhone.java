package tema4;

public class SmartPhone extends SmartDevice {

    double tamanoPantalla;
    int capacidadAlmacenamiento;

    public SmartPhone(){

    }

    public SmartPhone(String marca, String modelo, String color, int yearFabricacion,double tamanoPantalla, int capacidadAlmacenamiento){
        super(marca, modelo, color, yearFabricacion);
        this.tamanoPantalla = tamanoPantalla;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }
}
