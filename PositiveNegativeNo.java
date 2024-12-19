package day8;

import java.util.Scanner;

public class PositiveNegativeNo {

	public static void posNeg() {

		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter number for checking Positive or Negative: ");
		int num = scnr.nextInt();
		if(num >0) {
			System.out.println("Number is positive");
		}else {
			System.out.println("Number is negative");
		}
	}
	
	public static void main(String[] args) {
		posNeg();
		System.out.println();
	}
}

