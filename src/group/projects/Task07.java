package group.projects;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// 7. Write a java program to check whether a given
		// number is prime or not?

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your number:");
		int num = input.nextInt();

		boolean isPrime = true;

		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		} else {
			isPrime = false;
		}
		
		
		if (isPrime) {
			System.out.println(num + " is Prime");
		} else {
			System.out.println(num + " is not Prime");
		}
		
		
	}

}
