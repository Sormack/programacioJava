
package lecturadedatos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class metodos {
    String dato(){
        String dato = "";
        try {
            InputStreamReader datoAlmacenadoByts = new InputStreamReader(System.in);
            BufferedReader bytesACaracteres = new BufferedReader(datoAlmacenadoByts);
            dato = bytesACaracteres.readLine();
            System.out.println("Dato tecleado: "+ dato);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return dato;
    }
    
    int datoInt(){
        String dato = dato();
        return Integer.parseInt(dato);
    }
}
