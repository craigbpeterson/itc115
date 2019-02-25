
public class ArrayIsSorted {

	public static void main(String[] args) {
		//init arrays
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		
		System.out.println("list1 is sorted: " + isSorted(list1));
		System.out.println("list2 is sorted: " + isSorted(list2));
		
	}//end of main
	
	public static Boolean isSorted(double[] list) {
		if (list.length == 1) {
			return true; //the assignment states that an array containing one value is considered to be sorted
		}
		
		double prevNumber = list[0]; //get first number in the array
		
		for (int i = 1; i < list.length; i++) {	//start for loop on second index
			if (prevNumber > list[i]) { //check prevNumber against value at current index
				return false; //if prevNumber is greater than value at current index, return false 
			}
			prevNumber = list[i]; //update prevNumber for next time through loop
		}
		
		return true;//if method makes it through all loops without returning false, the array isSorted
		
	}//end of isSorted method

}//end of class
