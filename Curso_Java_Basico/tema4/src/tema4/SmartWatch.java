package tema4;

public class SmartWatch extends SmartDevice {

    boolean resistenciaAlAgua;

    public  SmartWatch(){

    }

    public SmartWatch(String marca, String modelo, String color, int yearFabricacion,boolean resistenciaAlAgua){
        super(marca, modelo, color, yearFabricacion);
        this.resistenciaAlAgua = resistenciaAlAgua;
    }

    public boolean isResistenciaAlAgua() {
        return resistenciaAlAgua;
    }

    public void setResistenciaAlAgua(boolean resistenciaAlAgua) {
        this.resistenciaAlAgua = resistenciaAlAgua;
    }
}
