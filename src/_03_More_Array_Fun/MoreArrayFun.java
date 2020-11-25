package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun maf = new MoreArrayFun();
		String[] strings = new String[5];
		Random rand = new Random();
		rand.nextInt(strings.length);
		strings[0] = "one";
		strings[1] = "two";
		strings[2] = "three";
		strings[3] = "four";
		strings[4] = "five";
		maf.printStrings(strings);
		maf.printBackwardsStrings(strings);
		maf.printEveryOtherString(strings);
		maf.printRandomStrings(strings, rand);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printStrings(String[] strings) {
		for(int i = 0; i<strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void printBackwardsStrings(String[] strings) {
		for(int i = strings.length-1; i>0; i--) {
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
		boolean[] printed = new boolean[5];
		for(int i = 0; i<printed.length; i++) {
			printed[i] = false;
		}
		int printedindex;
		for(int i = 0; i<100; i++) {
			printedindex = rand.nextInt(strings.length);
			if(printed[printedindex] = false) {
				System.out.println(strings[printedindex]);
				printed[printedindex] = true;
			}
			else if(printed[printedindex]) {
				printed[printedindex] = true;
			}
		}
	}
	
}
