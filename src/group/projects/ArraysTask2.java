package group.projects;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask2 {

	public static void main(String[] args) {
		/*2. Using Scanner create an array of countries and array of capitals. 
		 * When an array is created, retrieve all values from user and while
		retrieving those values print capital for each country.
		(use 2 different loops)
		.*/

		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter array countries size:");
		int size=input.nextInt();
	    
		String[] countries=new String[size];
		String[] capitals=new String[size];	
		
		input.nextLine();//just to consume that extra enter that will be getting from line number 18
		
		for(int i=0; i<size; i++) {
			System.out.println("Please enter your country:");
			countries[i]=input.nextLine();
			System.out.println("Please enter the capital for "+countries[i]);
			capitals[i]=input.nextLine();
		}
		
		System.out.println(Arrays.toString(countries));
		System.out.println(Arrays.toString(capitals));
	    
		
		for(int i=0; i<size; i++) {
			System.out.println("The "+countries[i]+" has the capital "+capitals[i]);
		}
		
	
	
	
		}
	}
		
		
	


