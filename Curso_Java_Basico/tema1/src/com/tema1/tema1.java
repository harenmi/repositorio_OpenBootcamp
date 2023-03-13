package com.tema1;

public class tema1 {

    public static void main(String[] args) {

        // Tipos de datos

        // 1. Numericos:

        // 1.1. enteros
        byte numero1 = 1;
        System.out.println(numero1 + ", es un de tipo byte");

        short numero2 = 2;
        System.out.println(numero2 + ", es un de tipo short");

        int numero3 = 3;
        System.out.println(numero3 + ", es un de tipo int");

        long numero4 = 4;
        System.out.println(numero4 + ", es un de tipo long");

        // 1.2. punto flotante
        float decimal1 = 4.9f;
        System.out.println(decimal1 + ", es un de tipo float");

        double decimal2 = 9.99d;
        System.out.println(decimal2 + ", es un de tipo decimal");


        // 2. booleanos
        boolean verdadero = true;
        System.out.println(verdadero);

        boolean falso = false;
        System.out.println(falso);


        // 3. Texto:

        // 3.1. caracter
        char caracter = 'a';
        System.out.println(caracter + ", es un de tipo char");

        // 3.2. cadena de texto
        String nombre = "Harold Montalban";
        System.out.println(nombre);

        // 4. tipos envoltorio

        Integer num1 = null;
        System.out.println(num1);

        Long num2 = 2L;
        System.out.println(num2);
    }
}
