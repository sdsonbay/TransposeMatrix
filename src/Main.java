public class Main {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int row = matrix.length;
        int column = matrix[0].length;

        printMatrix(matrix, row, column);
        printTranspose(matrix, row, column);

    }

    public static void printMatrix(int[][] matrix, int row, int column){
        System.out.println("Matrix: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void printTranspose(int[][] matrix, int row, int column){
        System.out.println("Transpose: ");
        for(int i = 0; i < column; i++){
            for(int j = 0; j < row; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
