package tema4;

public class SmartDevice {

    String marca;
    String modelo;
    String color;
    int yearFabricacion;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, String color, int yearFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.yearFabricacion = yearFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearFabricacion() {
        return yearFabricacion;
    }

    public void setYearFabricacion(int yearFabricacion) {
        this.yearFabricacion = yearFabricacion;
    }
}
