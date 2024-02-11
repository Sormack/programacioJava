package com.mycompany.creacionpropiadeunmetodo;


public class CreacionPropiaDeUnMetodo {

    public static void main(String[] args) {
       //Se inicializa los valores a sumar 
       double uno = 10 , dos = 11 , res = 0;
       //Se manda a llamar el metodo sumar 
       res = sumar(uno, dos);
        System.out.println("El valor de la suma es: " + res);
    }
    
    //se nececesita especifuicar el tipo de valor que se introducen 
    public static double sumar(double valorUno ,double ValorDos ){
        //se inicializa la variable a retornar 
        double resultado = 0;  
        resultado = valorUno + ValorDos;
        return resultado;
    }
}
