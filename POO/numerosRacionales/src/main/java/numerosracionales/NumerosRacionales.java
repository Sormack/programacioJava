package numerosracionales;

public class NumerosRacionales {
    //Declaracion de los atributos privados
    private int numerador;
    private int denominador;
    
    //Declaracion de metodos
    public void asignarNumeros(int num,int den){
        if (den == 0){
            System.out.println("El denominador no pude ser cero");
        }else{
            numerador = num;
            denominador = den;
        }
    }
    
    public void mostrarResultado(){
        System.out.println(numerador+"/"+denominador);
    }
}
