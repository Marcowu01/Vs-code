// array è un oggetto

// double[] values = new double[10];
// meglio no int x[]

// int a = values.length;

// int[] primes = {2,3,5};

// values[i]++ == values[i] + 1

// modifico l'array


import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] numeri = new double[10];
        for (int i=0; i<numeri.length; i++){
            numeri[i] = scanner.nextDouble();

        }

        System.out.println("Inserisci un indice: ");
        int a = scanner.nextInt();
        if (a<0 || a>= numeri.length){
            System.out.println("Valore errato");
        }
        else{
            System.out.println(numeri[a]);

        }
        scanner.close();

    }

}



/**
 * 
 * Copiare Array
 * 
 * 
 * metodo arraycopy della classe System
 * 
 * 
 * 
 * System.arraycopy
 * 
 * 
 * System.arraycopy(from, array, indice, array, indice secondo array, quanti dati)
 * 
 */


