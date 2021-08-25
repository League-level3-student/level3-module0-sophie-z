package _03_Intro_to_2D_Arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Drum {
	public void beat() { 
		
	}
	public static void main(String[] args) {
		Drum[] drums = new Drum[5];
		for(int i = 0; i<drums.length; i++) {
			drums[i] = new Drum();
		}
		for(int i = 0; i<drums.length; i++) {
			drums[i].beat();
		}
		
		
		ArrayList<String> guests = new ArrayList<String>();
		for(int i = 0; i<3; i++) {
			String str = new String();
			guests.add(str);
		}
		
		
		HashMap<String, Integer> leagueStudents = new HashMap<String, Integer>();
		leagueStudents.put("sophie", 3);
		for(Entry<String, Integer> entry : leagueStudents.entrySet() ) {
			System.out.println( entry.getKey() + ", " + entry.getValue() );
		}
		
		
		char[] letters = {'A', 'B', 'C', 'D'};
		char temp = letters[3];
		letters[3] = letters[2];
		letters[2] = temp;
		
		
		ArrayList<Character> characters = new ArrayList<Character>();
		characters.add('a');
		characters.add('b');
		//characters.add("cd");
		characters.remove(0);
		characters.set( 0, 'z' );
		
		
	    String string = "     test     ";
	    string.trim();
	    
	    
	    String word = "yes";
	    reverseString(word);;
	    
	    
	    String str1 = "The League";
	    String str2 = "the league";
	    countLowerCase(str1);
	    countLowerCase(str2);
	    
	    
	    ArrayDeque<String> studentsWithQuestions = new ArrayDeque<String>();
	    	studentsWithQuestions.clear();
	}
	
	
	public static int getLocation(float[] numbers, float item){
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i] == item) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static String reverseString (String str){
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		System.out.println(str);
		return str;
	}
	
	
	public static int countLowerCase(String str) {
		int number = 0;
		for(int i = 0; i<str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				number = number + 1;
			}
		}
		System.out.println(number);
		return number;
	}
}
