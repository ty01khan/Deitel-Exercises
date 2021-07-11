import java.lang.*;
import java.io.*;
import java.util.*;

public class Example34 {
	public static void main(String[] args) {
		System.out.printf("Decimal\t\tBinary\t\tOctal\t\tHexadecimal%n");
		for(int i = 1; i <= 256; i++) {
			if(i >= 128)
				System.out.printf("%s\t\t%s\t%s\t\t%s%n", i, binary(i), octal(i), hexadecimal(i));
			else
				System.out.printf("%s\t\t%s\t\t%s\t\t%s%n", i, binary(i), octal(i), hexadecimal(i));
		}
	}
	
	public static String binary(int dec) {
		String bin = "";
		while(dec != 0) {
			bin += dec%2;
			dec /= 2;
		}
		StringBuilder sb = new StringBuilder(bin);
		sb.reverse();
		return sb.toString();
	}
	
	public static String octal(int dec) {
		String oct = "";
		while(dec != 0) {
			oct += dec % 8;
			dec /= 8;
		}
		
		StringBuilder sb = new StringBuilder(oct);
		sb.reverse();
		return sb.toString();
	}
	
	public static String hexadecimal(int dec) {
		int hex[] = new int[3];
		int cnt = 0;
		
		while(dec != 0) {
			hex[cnt] = dec%16;
			dec /= 16;
			cnt++;
		}
		
		String hexa = "";
		for(int i = cnt-1; i >= 0; i--) {
			if(hex[i] == 15) 
				hexa += "f";
			else if(hex[i] == 14)
				hexa += "e";
			else if(hex[i] == 13)
				hexa += "d";
			else if(hex[i] == 12)
				hexa += "c";
			else if(hex[i] == 11)
				hexa += "b";
			else if(hex[i] == 10)
				hexa += "a";
			else
				hexa += hex[i];
		}
		
		return hexa;
	}
}
