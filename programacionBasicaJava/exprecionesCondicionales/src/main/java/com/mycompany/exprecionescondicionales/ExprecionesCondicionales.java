package com.mycompany.exprecionescondicionales;

class ExprecionesCondicionales {

    public static void main(String[] args) {
        int numeroBase = 15;
        int numeroParaComparar = 20;
        //Condiciones con if y operadores de relacion 
        
        if(numeroBase < numeroParaComparar){
            System.out.println("El numero base es menor ");
        }
        
        //Condicionescon if y else 
        if(numeroBase > numeroParaComparar){
            System.out.println("El numero a comparar es el mayor");
        }else{
            System.out.println("EL numero base es menor");
        }
        
        //Condicones con else-if
        
        if(numeroBase <= numeroParaComparar){
            System.out.println("El numero base es menor o igual");
        }else if(numeroBase >= numeroParaComparar){
            System.out.println("El numeor a compar es mayor o igual");
        }
        
    }
}
