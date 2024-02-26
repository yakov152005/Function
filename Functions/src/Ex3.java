import java.util.Scanner;

public class Ex3 {
	public static void main(String [] args){
		int num1 = getInput();
		int num2 = getInput();
		int num3 = getInput();
		if (twoNumberPositive(num1, num2, num3)){
			System.out.println("True :)");
		}else {
			System.out.println("False :(");
		}
	}
	public static boolean twoNumberPositive(int num1, int num2, int num3){
		return (num1 >= 0 && num2 >= 0 ||  num3 >=0 && num2 >=0 || num1 >=0 && num3 >=0 );
	}
	public static int getInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		return s.nextInt();
	}
}
