package com.mycompany.lecturadatosprimitivos;

import java.io.*;

public class LecturaDatosPrimitivos {

    //Meto para la lectura de datos por teclado 
    public static String dato() {
        String dato = "";
        try {
            InputStreamReader datoAlmacenadoByts = new InputStreamReader(System.in);
            BufferedReader bytesACaracteres = new BufferedReader(datoAlmacenadoByts);
            dato = bytesACaracteres.readLine();
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }
        return dato;
    }

    //Convercion del dato tecleado a short
    public static short datoShort() {
        try {
            return Short.parseShort(dato());
        } catch (Exception e) {
            return Short.MIN_VALUE;
        }
    }

    public static int intDato() {
        try {
            return Integer.parseInt(dato());
        } catch (Exception e) {
            return Integer.MIN_VALUE;
        }
    }

    public static long longDato() {
        try {
            return Long.parseLong(dato());
        } catch (Exception e) {
            return Long.MIN_VALUE;
        }
    }

    public static float floatDato() {
        try {
            return Float.parseFloat(dato());
        } catch (Exception e) {
            return Float.MIN_VALUE;
        }
    }
    
    public static double doubleDato(){
        try {
            return Double.parseDouble(dato());
        } catch (Exception e) {
            return Double.NaN;
        }
    }

}
