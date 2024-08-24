import javax.swing.JOptionPane;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		
		int userInteger = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer or enter -99 to quit"));
		final int QUIT = -99;
		
		int largestInteger = userInteger;
		int smallestInteger = userInteger;
		
		int numIntegers = 0;
		
		while(userInteger != QUIT) {
			if(userInteger > largestInteger) {
				largestInteger = userInteger;
			}
			
			if(userInteger < smallestInteger) {
				smallestInteger = userInteger;
			}
			
			numIntegers++;
			userInteger = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer or enter -99 to quit"));
		}
		
		if(numIntegers > 0) {
			JOptionPane.showMessageDialog(null, "The largest integer is " + largestInteger);
			JOptionPane.showMessageDialog(null, "The smallest integer is " + smallestInteger);
		}
		else {
			JOptionPane.showMessageDialog(null, "No integers entered");
		}
	}
}

/*
import javax.swing.JOptionPane;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		
		int userInteger = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer or enter -99 to quit"));
		final int QUIT = -99;
		
		int[] userIntegerArray = new int[100];
		int numIntegers = 0;
		
		while(userInteger != QUIT) {
			userIntegerArray[numIntegers] = userInteger;
			numIntegers++;
			userInteger = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer or enter -99 to quit"));
		}
		
		if(numIntegers > 0) {
			JOptionPane.showMessageDialog(null, "The largest number is " + displayLargestNumber(userIntegerArray, numIntegers));
			JOptionPane.showMessageDialog(null, "The smallest number is " + displaySmallestNumber(userIntegerArray, numIntegers));
		}
		else {
			JOptionPane.showMessageDialog(null, "No integers entered");
		}
		
	}
	
	public static int displayLargestNumber(int[] array, int arraySize) {
		int largestNumber = array[0];
		
		for(int numberPosition = 1; numberPosition < arraySize; numberPosition++) {
			if(array[numberPosition] > largestNumber) {
				largestNumber = array[numberPosition];
			}
		}
		
		return largestNumber;
	}
	
	public static int displaySmallestNumber(int[] array, int arraySize) {
		int smallestNumber = array[0];
		
		for(int numberPosition = 1; numberPosition < arraySize; numberPosition++) {
			if(array[numberPosition] < smallestNumber) {
				smallestNumber = array[numberPosition];
			}
		}
		
		return smallestNumber;
	}
}
*/
