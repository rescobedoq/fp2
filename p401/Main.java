// @JUDGE_ID:  401  Java  "Palindromes"

import java.io.*;
import java.util.*;

class Main
{
    static String ReadLn (int maxLg)  // utility function to read from stdin
    {
        byte lin[] = new byte [maxLg];
        int lg = 0, car = -1;
        String line = "";

        try
        {
            while (lg < maxLg)
            {
                car = System.in.read();
                if ((car < 0) || (car == '\n')) break;
                lin [lg++] += car;
            }
        }
        catch (IOException e)
        {
            return (null);
        }

        if ((car < 0) && (lg == 0)) return (null);  // eof
        return (new String (lin, 0, lg));
    }

    public static void main (String args[])  // entry point from OS
    {
        Main myWork = new Main();  // create a dinamic instance
        myWork.Begin();            // the true entry point
    }

    void Begin()
    {
        String input;
        StringTokenizer idata;
        int a, b, min, max, num, n, cycle, cyclemax;
        
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
		
		int regular_palindrome = 0;
		int mirrored_string = 0;
		String characterLeft, characterRight, reverseOfLeft, reverseOfRight;
		

        while ((input = Main.ReadLn (255)) != null)
        {
        	/**/
        	/**/
        	regular_palindrome = 0;
    		mirrored_string = 0;
        	for(int i=0; i<(int)(input.length()/2); i++) {
    			characterLeft = Character.toString(input.charAt(i));
    			characterRight = Character.toString(input.charAt((input.length()-1)-i));
    			if( characterLeft.equals(characterRight) ) {
    				regular_palindrome = regular_palindrome + 1;
    			}
    			reverseOfLeft = list.get(characterLeft);
    			reverseOfRight = list.get(characterRight);
    			if( characterRight.equals(reverseOfLeft) || characterLeft.equals(reverseOfRight)  )  {
    				mirrored_string = mirrored_string + 1;
    			}	
    		}
    		
    		String output = " -- is not a palindrome.";
    		int middle = (int)(input.length()/2); 
    		
    		if( (regular_palindrome == middle) && (mirrored_string >= middle) ) {
    			output = " -- is a mirrored palindrome.";
    		}else if(regular_palindrome == middle) {
    			output = " -- is a regular palindrome.";
    		}else if(mirrored_string >= middle) {
    			output = " -- is a mirrored string.";
    		}else {
    			output = " -- is not a palindrome.";
    		}
        	/**/
        	/**/
    		System.out.println(output);
    		/**/
    		/**/
        }
    }
}
