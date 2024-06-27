package polinomiotercergrado;

public class PolinomioTercerGrado {
    private float valorA;
    private float valorB;
    private float valorC;
    private float valorD;
    private float valorX;
    private float resultado;
    
    public void obtencionDeValores(float a,float b,float c,float d,float x){
        valorA = a;
        valorB = b;
        valorC = c;
        valorD = d;
        valorX = x;
        resultado = valorA*(valorX*valorX*valorX)+valorB*(valorX*valorX)-valorC*(valorX)+valorD;
    }
    
    public void mostrarResultador(){
        System.out.println("El valor del Polinomio de tercer grado es: "+ resultado);
    }
}
