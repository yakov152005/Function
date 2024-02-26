import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		System.out.println("How many Student? ");
		int totalStudents = getInput();
		double avg = totalAvgStudents(totalStudents);
		if (avgHigherThen60(avg)){
			System.out.println("The avg Higher then 60 :)");
		}else {
			System.out.println("The avg Lower then 60 :(");
		}
	}

	public static double totalAvgStudents(int totalStudent){
		int sumGrades = 0;
		for (int i = 1; i <= totalStudent; i++) {
			System.out.println("Enter a grades for student " + i + ":");
			int grades = getInput();
			sumGrades += grades;
		}
		return (double) sumGrades / totalStudent;
	}
	public static int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	public static boolean avgHigherThen60 (double avg) {
		return avg >60;
	}
}
