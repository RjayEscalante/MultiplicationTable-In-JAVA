public class  Character {
    // Rjay Fernandez Escalante
    // BSCS 1B
    // 202210276
    public static void main(String[] args) {
        int n = 5;
        char c = '*';
        for(int i=1;i<=n+1;i++) {
            for(int j=1;j<=n;j++) {
                    System.out.print(c);
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
