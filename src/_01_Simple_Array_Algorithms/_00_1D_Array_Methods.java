package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		int[] integers = new int[5];
		int sum = 0;
		for(int i = 0; i <= integers.length; i++){ 
		    integers[i] = i;
		    sum = sum + integers[i];
		}
		return sum;
	}
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
		int[] integers2 = new int[5];	
		int sum = 0;
		int average = 0;
		for(int i = 0; i <= integers2.length; i++){ 
		    integers2[i] = i;
		    sum = sum + integers2[i];
		}
		average = sum/5;
		return average;
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
		int[] integers3 = new int[5];
		boolean tf = false;
		for(int i = 0; i <= integers3.length; i++) {
			if(integers3[i]==value) {
				tf = true;
			}
		}
		return tf;
	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		int[] integers4 = new int[5];
		int index = -1;
		for(int i = 0; i<=integers4.length; i++) {
			if(integers4[i]==value) {
				index = 0 + i + 1;
			}
		}
		return index;
	}
}
