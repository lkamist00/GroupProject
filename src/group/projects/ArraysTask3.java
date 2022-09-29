package group.projects;

import java.util.Arrays;

public class ArraysTask3 {

	public static void main(String[] args) {
	  
		//3. Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] arr= {
				{10,20,30,40},
				{100,200,300,400},
				{1,2,3,4}
			};
		int sum=0;
		
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++) { 
				sum=sum+ arr[r][c];	
			}			
		}
		
		System.out.println(sum);

		sum=0;
		for(int[] ar:arr) {
			for(int num:ar) {
				sum+=num;
			}
		}
		System.out.println(sum);
		
	}

}
