import java.util.*;
public class Sum2matrix {
    static Scanner sc=new Scanner(System.in);

    static void matrixread(int row,int col,int[][] mat){
        for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print("enter"+"["+i+"]"+"["+j+"]");
                    mat[i][j]=sc.nextInt();
                }
            }
    }
    public static void main(String[] args) {
       
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][] a=new int[rows][cols];
        matrixread(rows,cols,a);
        int[][] b=new int[rows][cols];
        matrixread(rows,cols,b);

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         a[i][j]=sc.nextInt();
        //     }
        // }

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         b[i][j]=sc.nextInt();
        //     }
        // }

        int[][] c=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                c[i][j]=a[i][j] + b[i][j];
            }
        }

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
