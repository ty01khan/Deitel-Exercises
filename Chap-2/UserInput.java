import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1, num2, sum;
		num1 = input.nextInt();
		num2 = input.nextInt();
		sum = num1 + num2;
		System.out.printf("%d%n", sum);;
	}

}
