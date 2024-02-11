package com.mycompany.exprecionesaritmeticas;

public class ExprecionesAritmeticas {

    public static void main(String[] args) {
       double datoUno= 8,datoDos=10;
       double suma,resta,divicion,multiplicacion,modulo;
        //Suma
        suma = datoUno + datoDos;
        
        //Resta 
        resta = datoUno - datoDos;
         
        //Dovicion 
        divicion = datoUno / datoDos;
        
        //Multiplicacion 
        multiplicacion = datoUno * datoDos;
        
        //Modulo 
        
        modulo = datoUno % datoDos;
        
        //para mostrar datos sin salto de linea
        System.out.print("Resultado de la suma: ");
        //para mostrar datos en pantalla con un salto de linea 
        System.out.println(suma);
        System.out.println("Resultado de la resta");
        System.out.println(resta);
        //para mostra los datos en una sola linea de print
        System.out.println("EL resultado de la nustilicacion es: "+multiplicacion);
        System.out.println(divicion);
        System.out.println(modulo);
    }
}
