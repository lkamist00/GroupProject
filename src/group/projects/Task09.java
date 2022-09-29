package group.projects;

public class Task09 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		
		int[][] num = { 
				{ 10, 5, 8, 55, 67, 88, 44 }, 
				{ 74, 8643, 66, 1, 443, }, 
				{ 165, 678, 893, 55 } 
				};
		
		int max=0;
		int min=num[0][0];
		
		for(int r=0; r<num.length; r++ ) {
			for(int c=0; c<num[r].length; c++) {
				if(num[r][c]>max) {
					max=num[r][c];
					
				}else if (num[r][c]<min) {
					min=num[r][c];
				}
			}
		}
		System.out.println("Largest number is "+max);
		System.out.println("Smallest number is "+min);
		
		
		
		
		
		

	}

}
