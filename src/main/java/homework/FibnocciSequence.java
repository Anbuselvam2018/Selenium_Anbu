package homework;

public class FibnocciSequence {
	private static int index = 0;
	public static void main(String[] args) {
	int n1=0;
	int n2=1;
	System.out.println("n1="+n1);  
	  fibonacciSequence(n1, n2); 
	}
	public static void fibonacciSequence(int n1, int n2)  
	{  
	  System.out.println("n2="+n2);  
	  System.out.println("index: " + index + " -> " + n2); 
	}    
    
 
}
