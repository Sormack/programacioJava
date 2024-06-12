package tiposdecoches;

public class crearCoche {
    public static void main(String[]arg){
        TiposDeCoches nuevoCoche = new TiposDeCoches();
        nuevoCoche.establecerValores("Honda","Rojo", "2008");
        nuevoCoche.datosCoche();
        nuevoCoche.encendidoDelMotor(true);
        nuevoCoche.velocidades(2);
        nuevoCoche.frenado(true);
        
    }
}
