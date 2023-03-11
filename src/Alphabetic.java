public class Alphabetic {
    public static void main(String[] args){

        char i = 'A';
        System.out.println("While statement");
        while(i <= 'Z'){
            System.out.print(i + "");
            i++;
        }
        i = 'a';
        while(i <= 'z'){
            System.out.print("" + i);
            i++;
        }

    }
}