import java.util.Scanner;

public class DistanceAndTriangle {
	public static void main(String []args){
		triangle();
	}
	public static void triangle(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a base and char for Triangle: ");
		int base = getInput();
		char ch = s.next().charAt(0);
		printTriangle(base,ch);
	}
	public static void printTriangle(int base, char ch){
		for (int i = 1; i <= base; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

	public static double distance(int x1, int y1, int x2, int y2){
		final double power = 2;
		float xDiffPower = x2 -x1;
		float yDiffPower = y2 -y1;
		double sum1 = Math.pow(xDiffPower, power);
		double sum2 = Math.pow(yDiffPower, power);
		double finalSum = Math.sqrt(sum1 + sum2);
		return finalSum;
	}
	public static void Dis(){
		System.out.println("Enter a X1 and Y1:");
		int x1 = getInput();
		int y1= getInput();
		System.out.println("Enter a X2 and Y2:");
		int x2 = getInput();
		int y2= getInput();
		double result = distance(x1, y1, x2,y2);
		System.out.println(result);
	}
	public static int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
}
