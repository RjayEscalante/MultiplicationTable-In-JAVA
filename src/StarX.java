// Rjay Fernandez Escalante
// BSCS 1B
// 202210276

public class  StarX {
    public static void main(String[] args) {
        int n= 9;
        char c = '*';
        int k=n*2-1;

        for(int i=1;i<=k;i++) {
            for(int j=1;j<=k;j++) {
                if(j==i || j==k-i+1)
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


