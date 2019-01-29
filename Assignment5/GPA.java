import java.util.*;

public class GPA {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.println(printGPA(console));
	}
	
	public static String printGPA(Scanner console) {
		System.out.print("Enter a student record: "); //prompt user
		String record = console.nextLine(); //get input from user
		
		record = record.trim(); //remove white space from beginning and end of user input string, if necessary
		String[] recordArray = record.split(" "); //creates an array from the string, splitting on each space
		
		String studentName = recordArray[0]; //get student name
		int numOfScores = Integer.parseInt(recordArray[1]); //get number of scores
		
		//get sum of all scores
		int sum = 0;
		int score;
		for (int i = 2; i < recordArray.length; i++) { //start at array index 2 for the first score
			score = Integer.parseInt(recordArray[i]); //convert each score from string to int
			sum += score; //add up all scores from the array
		}
		
		double gradeAvg = ((double)sum) / numOfScores; //calculate avg score
		
		String result = studentName + "'s grade is " + gradeAvg;
				
		return result;
	}

}
