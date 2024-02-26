import java.util.Random;
import java.util.Scanner;

public class Ex7 {
	public static void main(String []args){
		int number = getInput();
		dividesRandomNumber(number);
	}
	public static int getInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		return s.nextInt();
	}
	public static void dividesRandomNumber(int number){
		Random random = new Random();
		for (int i = 1; i <=number ;i++) {
			int number1 = random.nextInt(number) +1;
			if (number % number1 == 0){
				System.out.println(number1);
			}
		}
	}
}
