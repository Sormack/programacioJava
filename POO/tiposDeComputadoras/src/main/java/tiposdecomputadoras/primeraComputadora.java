package tiposdecomputadoras;

public class primeraComputadora {
    public static void main(String[]args){
        TiposDeComputadoras nuevaComputadora = new TiposDeComputadoras();
        nuevaComputadora.prenderComputadora(false, false);
        nuevaComputadora.establecerMarca("Dell");
        nuevaComputadora.establcerProcesador("Intel");
        nuevaComputadora.establecerPeso((float) 9.215);
        nuevaComputadora.estado();
    }
}
