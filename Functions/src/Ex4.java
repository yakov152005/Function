import java.util.Random;
import java.util.Scanner;

public class Ex4 {
	public static void main(String []args){
		int number = getInput();
		numberNRange(number);
	}
	public static int getInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		return s.nextInt();
	}
	public static void numberNRange(int number){
		Random random = new Random();
		for (int i = 1; i <=number ;i++) {
			int number1 = random.nextInt(number);
			System.out.println(number1);
		}
	}
}
