import java.util.Scanner;
import java.lang.String;
public class SwitchStatement {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Character: ");
        String myInp = in.nextLine();

        switch (myInp) {
            case 1:
                System.out.println("Area of a circle given the radius");
                break;
            case 2:
                System.out.println("Area of triangle given the base and height");
                break;
            case 3:
                System.out.println("Area of square given the side");
                break;
            case 4:
                System.out.println("Area of rectangle given the length and width");
                break;

            default:
                System.out.println("Exit");
        }
    }
}
