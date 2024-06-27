package com.mycompany.lecturadatosprimitivos;

public class lecturaDatos {

    public static void main(String[] args) {
        short datoShort = 0;
        int datoInt = 0;
        long datoLong = 0;
        float datoFloat = 0;
        double datoDouble = 0;
        
        System.out.println("Dato tipo short:" );
        datoShort = LecturaDatosPrimitivos.datoShort();
        System.out.println("Dato tipo int:");
        datoInt = LecturaDatosPrimitivos.intDato();
        System.out.println("Dato tipo long:");
        datoLong = LecturaDatosPrimitivos.longDato();
        System.out.println("Dato tipo float:");
        datoFloat = LecturaDatosPrimitivos.floatDato();
        System.out.println("Dato tipo double: ");
        datoDouble = LecturaDatosPrimitivos.doubleDato();
        
        System.out.println("Dato almacenado tipo short: " + datoShort);
        System.out.println("Dato almacenado tipo int: " +datoInt);
        System.out.println("Dato almacenado tipo long: " +datoLong);
        System.out.println("Dato almacenado tipo float: " +datoFloat);
        System.out.println("Dato almacenado tipo double: " +datoDouble);
    }
}
