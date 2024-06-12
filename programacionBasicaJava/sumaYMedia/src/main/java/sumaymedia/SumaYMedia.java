package sumaymedia;

public class SumaYMedia {

    public static void main(String[] args) {
        int numUno,numDos,numTres,numCuatro;
        int suma,media;
        numUno = 10;
        numDos = 15;
        numTres = 23;
        numCuatro = 18;
        
        suma = numUno + numDos + numTres + numCuatro;
        media = suma / 4;
        System.out.println("La suma total de los cutro numereos es: " + suma);
        System.out.println("La media de los cuatro numeros es: " + media);
        System.out.println("Esta media redonde el resultado final no muetra "
                + "decinmaeles");
    }
}
