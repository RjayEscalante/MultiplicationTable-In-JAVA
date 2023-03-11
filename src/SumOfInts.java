public class SumOfInts {
    public static void main(String[] args) {

        // this program requires two
        // arguments on the command line
        if (args.length == 4) {
            // convert strings to numbers
            int a  = Integer.parseInt(args[0]);
            int b  = Integer.parseInt(args[1]);
            int c  = Integer.parseInt(args[2]);
            int d  = Integer.parseInt(args[3]);
            // int e  = Integer.parseInt(args[4]);

            //int sum = a + b + c + d;
            // do some arithmetic
            System.out.println();
        } else {
            System.out.println("This program " +
                    "requires 4 command-line arguments.");
        }
    }
}