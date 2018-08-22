
/*
Ansel Smolund 8/22/18

Write an algorithm such that if an element in a NxN matrix is 0, the 
entire row and column are set to 0

*/
import static java.lang.Integer.parseInt;
import java.util.ArrayList;


public class ZeroMatrix {
    
    public static void zeroMatrix(int [][] matrix){
        int[][] result = new int[matrix.length][matrix.length];
        ArrayList<String>flags = zeroFlags(matrix);
        for(String coord : flags){
            char axis = coord.charAt(0);
            int colrow = parseInt(coord.substring(1, coord.length()));
            if(axis =='i'){
                for(int i = 0; i < matrix.length;i++){
                   matrix[colrow][i] = 0; 
                }    
            }
            if(axis == 'j'){
                for(int i = 0; i < matrix.length;i++){
                    matrix[i][colrow] = 0;
                }
            }
        }
       
    }
    public static ArrayList zeroFlags(int[][]matrix){
        ArrayList<String>flags = new ArrayList<>();        
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j] == 0){              
                    if(!flags.contains("i" + String.valueOf(i))){
                        flags.add("i" + String.valueOf(i));
                    }
                    if(!flags.contains("j" + String.valueOf(j))){
                        flags.add("j" + String.valueOf(j));
                    }
                }
            }
        }
        return flags;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,0,1},{1,1,1},{1,0,1}};
        for(int [] i:matrix){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        zeroMatrix(matrix);
        for(int [] i:matrix){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }    
}
