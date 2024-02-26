import java.util.Scanner;

public class Ex10 {
	public static void main(String []args){
		System.out.println("Enter a number for Multiplication table: ");
		int number = getInput();
		multiplicationTable(number);
	}
	public static int getInput (){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	public static void multiplicationTable(int number){
		for (int i = 1; i <= number; i++) {
			for (int j = 1 ; j <= number; j++){
				System.out.print(" ");
				System.out.print( j*i + "");
				System.out.print("");
			}
			System.out.println();
		}
		System.out.println();

	}
}
