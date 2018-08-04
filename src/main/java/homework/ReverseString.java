
/* using scanner getting the input
 * store the string by using nextLine() --> it reads input including space between the words 
 * CharAt(Index) This method returns the character located at the String's specified index. The string indexes start from zero.
 */
package homework;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter String to reverse : ");
		Scanner read = new Scanner(System.in);
		String str=read.nextLine(); 
		String reverse="";
		for(int i=str.length()-1; i>=0;i--) 
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse String is :" +reverse );
	}

}
