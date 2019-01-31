import java.util.*;

public class GPA {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("GRADE CALCULATOR");
		System.out.println("To calculate a grade, enter the student");
		System.out.println("record on one line starting with the");
		System.out.println("name, then the number of grades to average,");
		System.out.println("then each grade separated by spaces.");
		System.out.println();
		System.out.println("For example, if Maria has 5 grades to");
		System.out.println("average, her record would look like this:");
		System.out.println();
		System.out.println("Maria 5 72 91 84 89 78");
		System.out.println();
		
		System.out.println(printGPA(console));
	}
	
	public static String printGPA(Scanner console) {
		System.out.print("Enter a student record: "); //prompt user

		String studentName = console.next(); //get name from user input
		int numOfScores = Integer.parseInt(console.next()); //get number of scores to average from user input
		
		//get sum of all scores
		int sum = 0;
		int score;
		for (int i = 1; i <= numOfScores; i++) {
			score = Integer.parseInt(console.next()); //convert each score from string to int
			sum += score; //add up all scores from the array
		}
		
		double gradeAvg = ((double)sum) / numOfScores; //calculate avg score
		
		String result = studentName + "'s grade is " + gradeAvg;
				
		return result;
	}

}
