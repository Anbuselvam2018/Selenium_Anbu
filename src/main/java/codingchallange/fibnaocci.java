package codingchallange;

import java.util.Scanner;

public class fibnaocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number upto which Fibonacci series to print: ");

		int number = new Scanner(System.in).nextInt();
		System.out.println("Fibonacci series upto " + number +" numbers : ");
		for(int i=0;i<=number;i++) {
			System.out.println(fibnaocci2(i)+" ");
		}


	}

}
