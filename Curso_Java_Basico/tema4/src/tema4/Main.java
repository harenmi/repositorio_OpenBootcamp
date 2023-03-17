package tema4;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartDevice1 = new SmartPhone("Samsung", "123456k","negro", 2016, 5.5,32);

        System.out.println("SmartPhone");
        System.out.println("marca: " + smartDevice1.getMarca());
        System.out.println("modelo: " + smartDevice1.getModelo());
        System.out.println("color: " + smartDevice1.getColor());
        System.out.println("año de fabricacion: " + smartDevice1.getYearFabricacion());
        System.out.println("tamaño de pantalla: " + smartDevice1.getTamanoPantalla());
        System.out.println("capacidad de almacenamiento: " + smartDevice1.getCapacidadAlmacenamiento());

        System.out.println("-------------------------------");

        SmartWatch smartDevice2 = new SmartWatch("casio", "234HG","azul", 2020, true);

        System.out.println("SmartWatch");
        System.out.println("marca: " + smartDevice2.getMarca());
        System.out.println("modelo: " + smartDevice2.getModelo());
        System.out.println("color: " + smartDevice2.getColor());
        System.out.println("año de fabricacion: " + smartDevice2.getYearFabricacion());
        System.out.println("tamaño de pantalla: " + smartDevice2.isResistenciaAlAgua());


    }

}
