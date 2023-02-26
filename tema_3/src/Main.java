public class Main {
    public static void main(String[] args) {
        suma(100, 200, 500);

        Coche miCoche = new Coche();
        miCoche.incrementaPuertas();
        miCoche.incrementaPuertas();
        miCoche.incrementaPuertas();
        System.out.println("Numero de Puertas del coche: " + miCoche.numeroPuertas);
    }

    public static void suma (int n1, int n2, int n3) {
        int resultado = n1 + n2 + n3;
        System.out.println(resultado);
    }

}

class Coche {
    public int numeroPuertas;

    public void incrementaPuertas() {
        this.numeroPuertas ++;
        //System.out.println(this.numeroPuertas);
    }
}