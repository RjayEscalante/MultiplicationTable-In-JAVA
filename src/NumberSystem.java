import java.util.Scanner;
public class NumberSystem {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        switch (num) {
            case 1:
                System.out.println("invalid");
                break;
            case 2:
                System.out.println("Binary " + " 0,1 ");
                break;
            case 3:
                System.out.println("invalid");
                break;
            case 4:
                System.out.println("invalid");
                break;
            case 5:
                System.out.println("Invalid");
                break;
            case 6:
                System.out.println("Invalid");
                break;
            case 7:
                System.out.println("Invalid");
                break;
            case 8:
                System.out.println("Octal " + " 0,1,2,3,4,5,6,7");
                break;
            case 9:
                System.out.println("Invalid");
                break;
            case 10:
                System.out.println("Decimal " + " 0,1,2,3,4,5,6,7,8,9 ");
                break;
            case 11:
                System.out.println("Invalid");
                break;
            case 12:
                System.out.println("Invalid");
                break;
            case 13:
                System.out.println("Invalid");
                break;
            case 14:
                System.out.println("Invalid");
                break;
            case 15:
                System.out.println("Invalid");
                break;
            case 16:
                System.out.println("Hexadecimal " + " 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F");
                break;
            default:
                System.out.println("Exit");
        }
    }
}


