package hacker_Rank_Pacakge;

import java.util.*;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNextLine()){
            String inp = scan.nextLine();
            String[] input = inp.split(";");
            //String op = input[0];
            //String type = input[1];
            //String text = input[2];
            if(input[0].equals("S"))
                System.out.println(split(input[1],input[2]));
            else if(input[0].equals("C"))
                System.out.println(combine(input[1], input[2]));
                
        }
        scan.close();

	}
	
	public static String split(String type, String text){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<text.length(); i++){
        	
            char c = text.charAt(i);
            if(Character.isUpperCase(c)) {
            	if(i>0) 
            		result.append(" ");
            	result.append(Character.toLowerCase(c));
            }
            else if(c=='('||c==')')
            	continue;
            else if(Character.isLowerCase(c))
            	result.append(c);
        }
        return result.toString();
    }
	
	public static String combine(String type, String text) {
		StringBuilder result = new StringBuilder();
		String[] words = text.split(" ");
			
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			if(i==0 && !type.equals("C"))
				result.append(word.toLowerCase());
			else {
				result.append(Character.toUpperCase(word.charAt(0)));
				result.append(word.substring(1).toLowerCase());
			}
		}
		if(type.equals("M"))
			result.append("()");
		return result.toString();
	}

}

/*
 * S;M;plasticCup() 
 * C;V;mobile phone 
 * C;C;coffee machine 
 * S;C;LargeSoftwareBook
 * C;M;white sheet of paper 
 * S;V;pictureFrame
 */

