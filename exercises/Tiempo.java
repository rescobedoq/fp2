import java.util.*;

public class Tiempo {

    public static void main(String args[]) {
    
        long empezando = System.nanoTime();
        for(int i=0; i<=Integer.parseInt(args[0]); i++) {
            System.out.println(i);
        }
        long terminando = System.nanoTime();

        System.out.println("TIEMPO : " + (terminando-empezando) + " ns.");
    
    }

}
