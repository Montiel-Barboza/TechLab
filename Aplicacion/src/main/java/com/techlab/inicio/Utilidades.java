package com.techlab.inicio;
import java.util.Scanner;

public class Utilidades {
    public static String formatearNombre(String nombre) {
        nombre = nombre.trim().toLowerCase(); // Paso 1
        String[] palabras = nombre.split(" "); // Paso 2
        StringBuilder sb = new StringBuilder(); // Paso 3

        for (String palabra : palabras) { // Paso 4
            if (!palabra.isEmpty()) {
                sb.append(Character.toUpperCase(palabra.charAt(0))) // Letra inicial en mayúscula
                        .append(palabra.substring(1)) // El resto en minúscula
                        .append(" "); // Agrega espacio entre palabras
            }
        }
        return sb.toString().trim(); // Quita el último espacio y retorna
    }

    public static int leerEntero(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        while (!sc.hasNextInt()){
            System.out.println("Debe ingresar un numero entero. Intente de nuevo: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static double leerDouble (Scanner sc, String mensaje) {
        System.out.println(mensaje);
        while (!sc.hasNextDouble()){
            System.out.println("Debe ingresar un numero Double. Intente de nuevo: ");
            sc.nextDouble();
        }
        return sc.nextDouble();
    }


    /* public static void main(String[] args) {
        int numero = 1231335;
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setGroupingSeparator('.');
        DecimalFormat formato = new DecimalFormat("#,###",simbolo);
        String numeroFormateado = formato.format(numero);
        System.out.println(numeroFormateado);} */
}
