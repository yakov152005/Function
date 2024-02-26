import java.util.Scanner;

public class Ex1 {
	public static void main(String[]  args) {
		int numOne = getInput();
		int numTwo =getInput();
		int numThree = getInput();
		if (greaterThanTen(numOne, numTwo, numThree)){
			System.out.println("The Numbers greater than ten :)");
		}else {
			System.out.println("the Numbers no greater than ten :(");
		}

	}
	public static boolean greaterThanTen(int n1, int n2, int n3){
		return  (n1 > 10 && n2 > 10 && n3 > 10);
	}
	public static int getInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		return s.nextInt();
	}


}
