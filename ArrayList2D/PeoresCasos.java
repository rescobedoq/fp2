import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class PeoresCasos {
    public static void main(String[] args) {

        int tamano;		        
	    Scanner teclado = new Scanner( System.in );
        System.out.print( "Introduzca cantidad de arreglos : " );
        tamano = teclado.nextInt();

        ArrayList<int[]> casos = new ArrayList<int[]>();
        for(int n=1; n<=tamano; n++) {
    	    casos.add(generarPeorCaso(n));
        }

        Iterator<int[]> puntero = casos.iterator();
        while(puntero.hasNext()){
    	    System.out.println(Arrays.toString(puntero.next()));
        } 

    }

    public static int[] generarPeorCaso(int t) {
	    int[] lista= new int[t];
	    for (int i=0; i<t; i++) {
		    lista[i] = t-i;		
	    }
	    return lista;		
    }
}
