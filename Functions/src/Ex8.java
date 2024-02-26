import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args){
		System.out.println("Enter a four numbers: ");
		int numOne = getInput();
		int numTwo=getInput();
		int numThree = getInput();
		int numFour = getInput();
		if (avgFor4Numbers(numOne ,numTwo,numThree, numFour)){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	public static int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	public static boolean avgFor4Numbers(int n1, int n2, int n3, int n4){
		double avg = (double)(n1 + n2 + n3 + n4) / 4;
		return (avg == n1 || avg == n2 ||avg == n3 ||avg == n4 );
	}

}
