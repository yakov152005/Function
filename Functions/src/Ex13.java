import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		System.out.print("Enter Odd number: ");
		int number = getInput();
		int validNumber = itsOddNumberOfDigits2(number);
		int middleDigit = itsOddNumberOfDigits3(validNumber);
		System.out.println("Middle digit: " + middleDigit);

	}
	public static boolean itsOddNumberOfDigits1 (int number){
		boolean res = false;
		int counter = 0;
		int temp = number;
		while (number != 0){
			number %= 10;
			counter++;
			temp /= 10;
			number = temp;
		}if (counter % 2 ==1){
			res = true;
		}
		return res;
	}
	public static int itsOddNumberOfDigits2 (int number){
		while (!itsOddNumberOfDigits1(number)){
			System.out.print("Enter odd number of digits: ");
			number =getInput();
		}
		return number;
	}

	public static int itsOddNumberOfDigits3(int number) {
		int digits = countDigits(number);
		int middleIndex = (digits + 1) / 2;
		return extractDigit(number, middleIndex);
	}
	public static int countDigits(int number) {
		int count = 0;
		while (number != 0) {
			number /= 10;
			count++;
		}
		return count;
	}
	public static int extractDigit(int number, int position) {
		while (position > 1) {
			number /= 10;
			position--;
		}
		return number % 10;
	}

	public static int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
}
