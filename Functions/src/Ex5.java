import java.util.Scanner;

public class Ex5 {
	public static void main(String []args){
		highNumber();
	}
	public static int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	public static void highNumber(){
		System.out.println("How many numbers would you like to enter? ");
		int enterNumbers = getInput();
		int higherNumber = 0;
		for (int i = 0; i < enterNumbers; i++) {
			System.out.println("Enter a number: ");
			int number = getInput();
			if (number > higherNumber) {
				higherNumber = number;
			}
		}
				System.out.println("The higher number is: " + higherNumber);
		}
	}

