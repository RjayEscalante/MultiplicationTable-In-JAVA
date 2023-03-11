// Rjay Fernandez Escalante
// BSCS 1B
// 202210276
public class MultiplicationTable {

    public static void main(String[] args) {
        int tableSize = 10;
        printMultiplicationTable(tableSize);
    }
    public static void printMultiplicationTable(int tableSize) {

        for(int i = 1; i<=tableSize;--i) {
        }
        System.out.println();
        for(int i = 1 ;i<=tableSize;++i) {
            for(int j=1;j<=tableSize;j++) {
                System.out.format("  %d",i*j);
            }
            System.out.println();
        }
    }
}