package tiposdecoches;

public class TiposDeCoches {
    //Declaracion de atributos 
    private String marca;
    private String color;
    private String modelo;
    private boolean motor;
    private int velocidad;
    private boolean frenar;
    
    //Declaracion de metodos
    public void establecerValores(String ma,String co,String mo){
        marca = ma;
        color = co;
        modelo = mo;
    }
    
    public void encendidoDelMotor(boolean mo){
        motor = mo;
        if(motor == true){
            System.out.println("Motor encendido");
        }else{
            System.out.println("Motor apagado");
        }
    }
    
    public void velocidades(int vel){
        velocidad = vel;
        if(velocidad == 1){
            System.out.println("Primera marcha");
        }else if(velocidad == 2){
            System.out.println("Segunda marcha");
        }else{
            System.out.println("ultima marcha");
        }
    }
    
    public void frenado(boolean fre){
        frenar = fre;
        if(frenar == true){
            System.out.println("Frenando");
        }else{
            System.out.println("No se esta frenando");
        }
    }
    
    public void datosCoche(){
        System.out.println("La marca del coche es: " + marca);
        System.out.println("El color del coche es: " + color);
        System.out.println("El modelo del coche es: " + modelo);
    }
}

