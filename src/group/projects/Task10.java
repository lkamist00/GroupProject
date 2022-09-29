package group.projects;

public class Task10 {

	public static void main(String[] args) {
		//10. Write a java program to find the second largest
		//number in the array?

		int[] num = {10, 5, 8, 858, 67, 88, 44, 74, 8643, 66, 1, 443};
		
		int largest=0;
		int secLargest=0;
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]>largest) {
				secLargest=largest;
				largest=num[i];
				
			}else if(num[i]>secLargest) {
				secLargest=num[i];
			}
		}
		System.out.println(secLargest);
		
		
		
		
		
		
		
		
		
		
	}

}
