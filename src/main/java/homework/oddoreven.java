package homework;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ener the numer: " );
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0) {
				System.out.println("Given number is even");	
			}
			else
			{
				System.out.println("Given number is odd");	
			}
		}

	}

