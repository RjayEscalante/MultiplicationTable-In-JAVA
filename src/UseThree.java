//Name: Escalante, Rjay F
//Student ID: 202210276
//Block: BS COMPUTER SCIENCE
public class UseThree{
    public static void main(String[] args){
        System.out.print("Hi ");
        for(int i = args.length-1; i >= 0; i--){
            System.out.print(args[i]);
            System.out.print(", ");
        }
    }
}