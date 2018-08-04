package homework;

public class ArrayConcepts {

	public static void main(String[] args) {

		double[] mylist= {1,3,5,8,99,24,56,80};
		//To print all number
		for(int i = 0; i<= mylist.length; i++) {
			System.out.println("The list is: " +mylist[i]);
		}

		//To Sum of all numbers
		double total =0;
		for(int i=0; i<= mylist.length; i++) {
			total=total + mylist[i];
						
		}
		System.out.println("The Sum is " + total);
	}

}
