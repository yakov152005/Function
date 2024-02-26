import java.util.Scanner;

public class Ex11And12 {
	public static void main(String[]args){

	}


	public static int getInput (){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	public static boolean onceDigit (int digit){
		return digit > 0 && digit < 10;
	}
	public static boolean numberOnDigit(int number, int digit){
		boolean result = false;
		int temp = number;

		while (number !=0){
			number %= 10;
			if (number == digit) {
				result = true;
				break;
			}else {
				temp /=10;
				number =temp;
			}

		}return result;
	}
	public static void Ex11(){
		System.out.println("Enter Number and enter digit:");
		int number = getInput();
		int digit = getInput();
		if (onceDigit(digit)){
			System.out.println(numberOnDigit(number, digit));
		}else {
			System.out.println("false :(");
		}
	}
	public static void isPositiveNumbers(){
		int counter = 0;
		int n1=getInput();
		int n2 = getInput();
		int n3;
		do {
			n3 = getInput();
			if (n1 < 0 || n2<0 || n3<0){
				counter--;
			}
			counter++;
		}while (counter <1);
		if (isRisingSeries(n1, n2, n3)) {
			System.out.println("Its rising series");
		}else {
			System.out.println("This is not an ascending series");
		}
	}
	public static boolean isRisingSeries(int n1 ,int n2, int n3){
		boolean result = false;
		int diff1= n3 - n2;
		int diff2 = n2 - n1;
		if (n3 > n2 && n2 > n1 && diff2 == diff1 ){
			result = true;
		}return result;
	}
	public static void Ex12(){
		System.out.println("Enter a Three positive numbers:");
		isPositiveNumbers();


	}
}