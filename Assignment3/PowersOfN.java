
public class PowersOfN {

	public static void main(String[] args) {
		printPowersOfN(2, 7);
		System.out.println();
		printPowersOfN(5, 3);
		System.out.println();
		printPowersOfN(4, 3);
		System.out.println();
		printPowersOfN(5, 6);
		System.out.println();
		printPowersOfN(-2, 8);
		System.out.println();
		
	}

	public static void printPowersOfN(int base, int maxExp) {
		for (int i = 0; i <= maxExp; i++) {
			int powResult = (int) Math.pow(base, i);
			System.out.print(powResult + " ");
		}
		
	}
	
}
