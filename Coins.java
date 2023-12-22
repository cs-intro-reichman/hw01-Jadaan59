/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int quarter = 25;
		
	System.out.println("Use " + (a / quarter) + " quarters and " + (a % quarter) + " cents ");
 
                         // Because of being "a" and "quarters" an integers,
			// so the devision between them is an integer number.
 
	}
}
