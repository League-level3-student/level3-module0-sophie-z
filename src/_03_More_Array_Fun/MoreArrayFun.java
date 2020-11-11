package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	String[] strings = new String[5];
	void printStrings(String[] strings) {
		for(int i = 0; i<strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void printBackwardsStrings(String[] strings) {
		for(int i = strings.length; i<0; i--) {
			System.out.println(strings[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void printEveryOtherString(String[] strings) {
		for(int i = 0; i<strings.length; i+=2) {
			System.out.println(strings[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	Random rand = new Random();
	void printRandomStrings(String[] strings, Random rand) {
		System.out.println(strings[rand.nextInt(strings.length)]);
	}
	
}
