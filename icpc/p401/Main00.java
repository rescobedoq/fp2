package p401;

import java.util.HashMap;
import java.util.Map;

class Main00 {

	public static void main(String[] args) {
		
		HashMap<String, String> list = new HashMap<String,String>();
		
		list.put("A", "A");
		list.put("B", null);
		list.put("C", null);
		list.put("D", null);
		list.put("E", "3");
		list.put("F", null);
		list.put("G", null);
		list.put("H", "H");
		list.put("I", "I");
		list.put("J", "L");
		list.put("K", null);
		list.put("L", "J");
		list.put("M", "M");
		list.put("N", null);
		list.put("O", "O");
		list.put("P", null);
		list.put("Q", null);
		list.put("R", null);
		list.put("S", "2");
		list.put("T", "T");
		list.put("U", "U");
		list.put("V", "V");
		list.put("W", "W");
		list.put("X", "X");
		list.put("Y", "Y");
		list.put("Z", "5");
		list.put("1", "1");
		list.put("2", "S");
		list.put("3", "E");
		list.put("4", null);
		list.put("5", "Z");
		list.put("6", null);
		list.put("7", null);
		list.put("8", "8");
		list.put("9", null);
		
		System.out.println("------------------------");
		System.out.println("Character\tReverse");
		for (Map.Entry<String, String> set : list.entrySet()) {			
           System.out.println(set.getKey() + "\t\t"+ set.getValue());
		}
		System.out.println("------------------------");
		
		//String input = "NOTAPALINDROME";
		//String input = "ISAPALINILAPASI"; 
		//String input = "2A3MEAS";
		String input = "ATOYOTA";
				
		int regular_palindrome = 0;
		int mirrored_string = 0;
		String characterLeft, characterRight, reverseOfLeft;
		
		for(int i=0; i<(int)(input.length()/2); i++) {			
			/**/
			characterLeft = Character.toString(input.charAt(i));
			characterRight = Character.toString(input.charAt((input.length()-1)-i));
			System.out.println("characterLeft : " + characterLeft);
			System.out.println("characterRight : " + characterRight);
			/**/
			if( characterLeft.equals(characterRight) ) {
				regular_palindrome = regular_palindrome + 1;
			}
			/**/	
			reverseOfLeft = list.get(characterLeft);			
			System.out.println("reverseOfLeft : " + reverseOfLeft);
			/**/
			if( characterRight.equals(reverseOfLeft) )  {
				mirrored_string = mirrored_string + 1;
			}
			/**/
		}
		
		/**/
		System.out.println("regular_palindrome : " + regular_palindrome);
		System.out.println("mirrored_string : " + mirrored_string);
		/**/
		if(regular_palindrome == (int)(input.length()/2) ) {
			System.out.println(" -- is a regular palindrome");
		}
		
		if(mirrored_string >= (int)(input.length()/2) ) {
			System.out.println(" -- is a mirrored string");
		}
		
	}

}
