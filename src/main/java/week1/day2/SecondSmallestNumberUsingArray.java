package week1.day2;

public class SecondSmallestNumberUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] my_array = {45, 44, 8, 2, 23, -3};
	
		    int min = Integer.MAX_VALUE;
		    int second_min = Integer.MAX_VALUE;
		    for (int i = 0; i < my_array.length; i++) {
		        if(my_array[i]==min){
		          second_min=min;
		        } else if (my_array[i] < min) {
		            second_min = min;
		            min = my_array[i];
		        } else if (my_array[i] < second_min) {
		            second_min = my_array[i];
		        }

		    }
		    System.out.println("Second smallest number is : " + second_min);
		    }
		}