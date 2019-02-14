import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BoyGirlAssignment {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("boysgirls.txt"));		//get the boysgirls.txt file and put it in a new Scanner object
	
		boyGirl(input);
	
	}
	
	public static void boyGirl(Scanner scanner) {
		//init variables
		int boyCount = 0;
		int girlCount = 0;
		int boySum = 0;
		int girlSum = 0;
		
		//fencepost: count gender and sum for the first data value
		boyCount++; //add one to the boy counter
		scanner.next(); //skip the first name
		boySum = boySum + scanner.nextInt(); //add the next value to the boySum
		
		String prevPerson = "boy"; //keep track of gender of last person
		
		while (scanner.hasNext()) {
			scanner.next(); //skip the next name
			
			//check to find out if next data value is for the boys or the girls
			if (prevPerson == "boy") {
				girlCount++; //add one to the girl counter
				girlSum = girlSum + scanner.nextInt(); //add the next value to the girlSum
				prevPerson = "girl"; //set gender of previous person for the purposes of this if/else block
			} else if (prevPerson == "girl") {
				boyCount++; //add one to the boy counter
				boySum = boySum + scanner.nextInt(); //add value to the boySum
				prevPerson = "boy"; //set last person for the purposes of this if/else block
			}
		}
		
		//calculate the difference between the sums
		int diff = girlSum - boySum;
		
		//output results to console
		System.out.println(boyCount + " boys, " + girlCount + " girls");
		System.out.println("Difference between boys\' and girls\' sums: " + diff);
		
	}

}
