package group.projects;

import java.util.Arrays;

import java.util.Scanner;

public class ArraysTask1 {

	public static void main(String[] args) {

		/*1. Using Scanner create an array of integer values. After
			the array is created, calculate the sum of all stored
			elements in that array.
		*/
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the size of your array:");
		int arraySize = input.nextInt();

		
		int[] arrayValues = new int[arraySize];
		int sum = 0;
		
		

		for (int i = 0; i < arrayValues.length; i++) {
			System.out.println("Please enter your array values:");
			arrayValues[i] = input.nextInt();
			sum += arrayValues[i];
		}
		System.out.println("The sum of all the values is:" + sum);

		
		System.out.println(Arrays.toString(arrayValues));
		
		
		
		
	}

}
