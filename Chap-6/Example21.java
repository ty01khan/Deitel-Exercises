import java.util.Scanner;
import java.lang.*;

public class Example21 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a string: ");
		String str = inp.nextLine();
		
		System.out.println(beautifyString(str));
	}
	
	public static String checkFullStop(String str) {
		if(str.charAt(str.length()-1) == '.')
			return str;
		else
			return (str + ".");
	}
	
	public static String isFirstUpperCase(String str) {
		if(Character.isUpperCase(str.charAt(0)))
			return str;
		String ch = str.substring(0, 1).toUpperCase();
		return ch + str.substring(1);
	}
	
	public static String beautifyString(String str) {
		return isFirstUpperCase(checkFullStop(str));
	}
}
