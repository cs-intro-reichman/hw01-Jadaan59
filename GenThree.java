public class GenThree {
    public static void main(String[] args) {
        
        // First, give the variables the command line arguments.

        int minrange = Integer.parseInt(args[0]);
        int maxrange = Integer.parseInt(args[1]);
		
		// idenify the generated numbers	

       int a = (int)(Math.random() * (maxrange - minrange) + minrange);
       int b = (int)(Math.random() * (maxrange - minrange) + minrange);   
       int c = (int)(Math.random() * (maxrange - minrange) + minrange);
     
       // need to generate the minimom of what printed...
       // idenify the min of the thee generated numbers.

       int d = Math.min(a, Math.min(b, c));

       // print the results out.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("The minimal generated number was " + d);
  }
}