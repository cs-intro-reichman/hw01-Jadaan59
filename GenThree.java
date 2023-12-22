/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// First, give the variables the command line arguments.

        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
		
			// print out three generated random number in the range [min, max).	

        System.out.println((int)(Math.random() * (max - min) + min));
        System.out.println((int)(Math.random() * (max - min) + min));
        System.out.println((int)(Math.random() * (max - min) + min));
        System.out.println("The minimal generated number was " + "" + min);
 	
	}
}
