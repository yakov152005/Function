import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		int numOne = getInput();
		int numTwo = getInput();
		if (isDivisible(numOne, numTwo)){
			System.out.println("Is divisible :) ");
		}else {
			System.out.println("Not divisible :( ");
		}
	}
	public static boolean isDivisible(int num1, int num2){
		boolean result=false;
		if (num2 == 0){
			return false;
		}else if (num1 % num2 ==0){
			result = true;
		}
		return result;
	}
	public static int getInput (){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		return s.nextInt();
		}
}
