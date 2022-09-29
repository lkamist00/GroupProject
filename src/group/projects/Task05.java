package group.projects;

public class Task05 {

	public static void main(String[] args) {
		/*5. Create a 2D array of integers. 
		 * Develop a program which will calculate 
		 * the sum of even and odd numbers for that array.
		*/
		
		int[][] num= {
				{12,18,4,9},
				{1,6,9,4,3},
				{14,67,7}
		};
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int r=0; r<num.length; r++) {
			for(int c=0; c<num[r].length; c++) {
				
				if(num[r][c]%2==0) {
					sumEven+=num[r][c];		
					
				}else if(num[r][c]%2!=0) {
					sumOdd+=num[r][c];
				}
			}
		}
		
		System.out.println(sumEven+" is the sum of the even numbers");
		System.out.println(sumOdd+" is the sum of the odd numbers");
		
		
		sumEven=0;
		sumOdd=0;
		
		for(int[] num1:num) {
			for(int num2:num1) {
				if(num2%2==0) {
					sumEven+=num2;
				}else {
					sumOdd+=num2;
				}
			}
		}
		System.out.println(sumEven+" is the sum of the even numbers");
		System.out.println(sumOdd+" is the sum of the odd numbers");
		
		
		
		
		
		
		
		
		
	}

}
