import java.util.Scanner;

public class Ex9 {
	public static void main (String[] args){
		higherNumber();
	}
	public static int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	public static void higherNumber(){
		boolean temp = false;
		int higherNum = 0;
		do {
			System.out.println("Enter a number: ");
			int number = getInput();
			if (number > higherNum){
				higherNum = number;
			}
			if (number == 0){
				temp = true;
			}
		}while (!temp);
		System.out.println(higherNum);
	}
}
