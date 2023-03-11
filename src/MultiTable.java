public class MultiTable {
    public static void main(String[] args) {
        int tableSize = 10;
        printMultiplicationTable(tableSize);
    }

    public static void printMultiplicationTable(int tableSize) {

        int j = 10;
        int[][] myArr = new int[j][j];
        
        
        int l1=100;
        int l2 = 90;
        int l3 = 80;
        int l4 = 70;
        int l5 = 60;
        int l6 = 50;
        int l7 = 40;
        int l8 = 30;
        int l9 = 20;
        int l10 = 10;
        
        for (int i = tableSize - 1; i >= 0; i--) {
            myArr[0][i] = l1;
            l1 = l1 - 10;
            myArr[1][i] = l2;
            l2 = l2 - 9;
            myArr[2][i] = l3;
            l3 = l3 - 8;
            myArr[3][i] = l4;
            l4 = l4 - 7;
            myArr[4][i] = l5;
            l5 = l5 - 6;
            myArr[5][i] = l6;
            l6 = l6 - 5;
            myArr[6][i] = l7;
            l7 = l7 - 4;
            myArr[7][i] = l8;
            l8 = l8 - 3;
            myArr[8][i] = l9;
            l9 = l9 - 2;
            myArr[9][i] = l10;
            l10 = l10 - 1;
        }
        
    
        for (int k = tableSize - 1; k >= 0; k--) {
            for(int o = 0; o<tableSize; o++){
                System.out.printf("%3d ",myArr[o][k]);
            }
            System.out.println();
        }
        
        
    }
}
