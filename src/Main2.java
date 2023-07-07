/**mirror matrix*/
public class Main2 {
    public static void main(String[] args) {
        int matrix [][] =
                {{3, 4, 5},
                        {7, 8, 9},
                        {1, 2, 3}};
        System.out.println("\n Normal matrix");
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix.length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\n Reverse matrix");
        printReverse(matrix);
    }

    public static void printReverse (int matrix[][]){
        for (int i=0; i<matrix.length; i++){             // lines
            for (int j=matrix[0].length-1; j>=0; j--){    // columns backwards
                System.out.print(matrix [i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
