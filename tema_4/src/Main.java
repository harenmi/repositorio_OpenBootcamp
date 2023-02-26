public class Main {
    public static void main(String[] args) {

        //Usando un if.

        var numeroIf = -5450.152;

        if (numeroIf > 0) {
            System.out.println(numeroIf + " es positivo");
        }
        else if (numeroIf < 0) {
            System.out.println(numeroIf + " es negativo");
        }
        else {
            System.out.println("¡El numero es un cero!");
        }

        //Creando un bucle while.

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Creando bucle do while.

        int numeroDoWhile = 100;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);

        //Creando bucle for.

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //Creando switch.

        String estacion = "Otoño";

        switch (estacion) {
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            default:
                System.out.println("El texto ingresado no es una estacion del año.");
        }
        

    }
}