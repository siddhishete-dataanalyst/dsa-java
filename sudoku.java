// public class sudoku {
//        public static boolean sudokuSolver(int sudoku[][],int row,int col,int digit){
//        //column 
//        for(int i=0; i<=8; i++){
//         if(sudoku[i][col]== digit){
//             return false;
//         }
//        }
//        //row
//        for(int j=0; j<=8;j++){
//         if(sudoku[row][j]== digit){
//             return false;

//         }
//        }

//        //grid
// int sr =(row/3)*3;
// int sc =(col/3)*3;
//        for(int i=sr; i<sr+3; i++){
//         for(int j=sc; j<sc+3; j++){
//             if(sudoku[i][j] == digit){
//                 return false;
//             }

//         }
//        }
//        return true;
       
//     }


//     public static boolean sudokuSolver (int sudoku[][],int row,int col){
//         //base case 
//        if(row == 9 && col == 0){
//         return false;
//        } 
       

//         //recursion 
//        int nextRow =row,nextCol = col+1;
//        if(col+1== 9){
//         nextRow = row+1;
//         nextCol =0;
//        }

//        if(sudoku[row][col]!= 0){
//         return sudokuSolver(sudoku,nextRow,nextCol);
//        }

    
//         for(int digit=1; digit<=9; digit++){
//             if(isSafe(sudoku,row,col,digit)) {
//                 sudoku[row][col]=digit;
//                if( sudokuSolver(sudoku, nextRow,nextCol)){ //soln existance 
//                 return true;
//                }
//                 sudoku[row][col]= 0;
//             }
//         }
//         return false;
//     } 

// public static void printSudoku(int sudoku[][]){
//     for(int i=0;i<9; i++){
//         for (int j=0;j<9;j++){
//             System.out.print(sudoku[i][j]+" ");
//         }
//         System.out.println();
//     }

// }

//     public static void main(String args[]){
//            int sudoku[][]={ { 0, 0,8,0,0,0,0,0,0},
//         {4,9,0,1,5,7,0,0,2},
//         {1,8,5,0,6,0,0,2,0},
//         {0,0,0,0,2,0,0,2,0},
//         {9,6,0,4,0,5,3,0,0},
//         {0,3,0,0,7,2,0,0,4},
//         {0,3,0,0,7,2,0,0,4},
//         {9,2,7,0,0,9,0,1,3} };


//  if(sudokuSolver(sudoku ,0,0)){
//     System.out.println("solution exists");
//     printSudoku(sudoku);

//  }else{
//     System.out.println("solution does not exist ");


//  }
//     }
// }


public class sudoku {


    // check if placing digit is safe
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // check column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // check row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // check 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    // recursive solver
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9) {
            return true; // solved entire board
        }

        // find next cell
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // skip filled cells
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // try digits 1–9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0; // backtrack
            }
        }
        return false; // no valid digit found
    }

    // print sudoku
    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int sudoku[][] = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists:\n");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists");
        }
    }
}
