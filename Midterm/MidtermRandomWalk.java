import java.util.Random;

public class MidtermRandomWalk {

	public static void main(String[] args) {

		randomWalk();

	}
	
	public static void randomWalk() {
		
		int position = 0; //initial position
		System.out.println("Position = " + position); //print initial position
		
		Random rand = new Random(); //create new random object
		
		//init variables
		int randNum = 0; 
		int step = 0;
		int maxPosition = 0;
		
		while (position < 3 && position > -3) { //loop until position reaches 3 or -3
		
			randNum = rand.nextInt(2); //generate random number 0 or 1
			
			//based on random number, either step forward or back
			if (randNum == 0) {
				step = -1;
			} else {
				step = 1;
			}
			
			position = position + step; //add step to current position
			
			//capture maximum position
			if (position > maxPosition) {
				maxPosition = position; 
			}
			
			System.out.println("Position = " + position); //print current position
		}
		
		System.out.println("Max Position = " + maxPosition); //print max position
		
	}

}
