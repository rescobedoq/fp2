import java.util.HashMap;
import java.util.Map;

class Main01 {

    public static void main(String args[]) {

        HashMap<String, String> lista = new HashMap<String, String>();

        lista.put("A", "A");
        lista.put("B", null);
        lista.put("C", null);
        lista.put("D", null);
	    lista.put("E", "3");
	    lista.put("F", null);
	    lista.put("G", null);
	    lista.put("H", "H");
	    lista.put("I", "I");
	    lista.put("J", "L");
	    lista.put("K", null);
	    lista.put("L", "J");
	    lista.put("M", "M");
	    lista.put("N", null);
	    lista.put("O", "O");
	    lista.put("P", null);
	    lista.put("Q", null);
	    lista.put("R", null);
	    lista.put("S", "2");
	    lista.put("T", "T");
	    lista.put("U", "U");
	    lista.put("V", "V");
	    lista.put("W", "W");
	    lista.put("X", "X");
	    lista.put("Y", "Y");
        lista.put("Z", "5");
	    lista.put("1", null);
	    lista.put("2", null);
	    lista.put("3", "E");
	    lista.put("4", null);
	    lista.put("5", "Z");
	    lista.put("6", null);
	    lista.put("7", null);
	    lista.put("8", "8");
	    lista.put("9", null);

        //System.out.println("--------------------");
        //for( Map.Entry<String, String> item : lista.entrySet() ) {
            //System.out.println(item.getKey() + "\t\t" + item.getValue());
        //} 
        //System.out.println("--------------------");

        //String input = "NOTAPALINDROME";
        //String input = "ISAPALINILAPASI";
        String input = "2A3MEAS";
        //String input = "ATOYOTA";

        int regular_palindrome = 0;
        int mirrored_string = 0;
        for(int i=0; i<input.length()/2; i=i+1) {
            //System.out.println(input.charAt(i));
            //System.out.println(input.charAt((input.length()-1)-i));
            if( input.charAt(i) == input.charAt((input.length()-1)-i) ) {
                regular_palindrome = regular_palindrome + 1;
            }
            /**/
            if ( ) {
                mirrored_string = mirrored_string + 1;
            }
            
        }

        if( regular_palindrome == input.length()/2 ){
            System.out.println(" -- is a regular palindrome.");
        }

    }


}
