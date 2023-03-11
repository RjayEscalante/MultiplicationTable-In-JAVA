// Escalante Rjay F
// BSCS 1B
// 202210276

public class RandomInt {
    public static void main(String[] args){
        // positive integer
        int n = Integer.parseInt(args[0]);

        // pseudo-random real between 0.0 and 1.0
        double r = Math.random();

        // pseufo-random integer between 0 and n-1
        int value = (int) (r * n);

        System.out.println(value);
    }
}
