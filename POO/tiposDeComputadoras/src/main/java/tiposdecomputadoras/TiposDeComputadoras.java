package tiposdecomputadoras;

//Declaracion de atributos de una computadora
class TiposDeComputadoras {
    String marca;
    String procesador;
    float peso;
    boolean encendido;
    boolean pantalla;

    //Declaracion de metodos de una computadora
    public void prenderComputadora(boolean pc,boolean pan){
        encendido = pc;
        pantalla = pan;
        if(encendido == true){
            System.out.println("La computadora esta encedida");
            System.out.println("La pantalla esta encendida");
        }else{
            System.out.println("La computadora esta apagada");
            System.out.println("La pantalla esta apagada");
        }
    }
    
    public void establecerMarca(String ma){
        marca = ma;
    }
    public void establcerProcesador(String cpu){
        procesador = cpu;
    }
    public void establecerPeso(float kg){
        peso = kg;
    }
    public void estado(){
        System.out.println("El estado de la conputadira es el siguiente");
        System.out.println("Marca: "+ marca);
        System.out.println("Procesador: "+procesador);        
        System.out.println("Peso: "+peso+"kg");
    }
}

