package week1.day2;



public class ToFindLargestNumberInTheGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] findBiggestNumbers = {23,34,45,-9,33};
	

	//To Find biggest Numbers
		int max = 0;
		int largeValue = 0;
		
		for(int i=0;i<=4;i++)
		{
		 if (max < findBiggestNumbers[i]) 
		 {
			 largeValue=findBiggestNumbers[i];
			 max=largeValue;
			 
		 }
		
		 }
		 System.out.println("Large Value  is " +largeValue);
	}
}


