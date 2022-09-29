package group.projects;

public class ArrayTask4 {

	public static void main(String[] args) {

		/*4. Create a 2D array or integer type where you will store	odd and even numbers. 
		 * Develop a program which will	identify/print the even numbers only
		*/
		
		
		int[][] num = { 
				{ 1, 5, 8, 55, 67, 88, 44 }, 
				{ 74, 8643, 66, 443, }, 
				{ 165, 678, 893, 55 } 
				};

		for(int r=0; r<num.length; r++) {
			for(int c=0; c<num[r].length; c++) {
				if(num[r][c]%2==0) {
					System.out.println(num[r][c]+" is even number");
				}
			}
		}

		for(int[]num1:num) {
			for(int num2:num1) {
				if(num2%2==0) {
					System.out.println(num2+" is even number");
				}
			}	
		}
		
		
		
		
		
		
	}
}
