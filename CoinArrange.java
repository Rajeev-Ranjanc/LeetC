//Arrange Coin
public class CoinArrange {
    public static void main(String[] args) {
//        int[][] matrix={{1,1,1},
//                {1,0,1},
//                {1,1,1}
//
//        };
        int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};

//        int[][] matrix={{0,1}};
        setzero(matrix);


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i-1].length;j++){
                System.out.print (matrix[i][j]+" ");
            }
            System.out.println ();
        }
    }

    static void setzero(int[][] matrix){
        int row=matrix.length;
        int col=matrix[row-1].length;

        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    markrow(matrix,i);
                    markcol(matrix,j);
                }
            }
        }

       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               if (matrix[i][j]==-1){
                   matrix[i][j]=0;
               }
           }
       }

    }


    static void markrow(int[][] matrix , int row){
        for(int j=0;j< matrix[row-1].length;j++){
            matrix[row][j]=-1;
        }
    }
    static void markcol(int[][] matrix , int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col]=-1;
        }
    }
}
