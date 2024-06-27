package lecturadedatos;

import java.io.*;

public class LecturaDeDatosPorTeclado {

    public static void main(String[] args) {
        /*InputStreamReader datoAlmacenadoByts = new InputStreamReader(System.in);
        BufferedReader bytesACaracteres = new BufferedReader(datoAlmacenadoByts);
    
        String dato;
        int datoNumerico = 0;
        
        try {
           dato = bytesACaracteres.readLine();//lee una cantidad de caracters
           datoNumerico = Integer.parseInt(dato);
           System.out.println(datoNumerico);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }*/
        metodos datoNuevo = new metodos();
        datoNuevo.datoInt();
        System.out.println("Dato: " + datoNuevo);
        
    }
    
    
}
