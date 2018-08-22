/*
Ansel Smolund 8/22/18

Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 deg

*/
public class RotateMatrix {
    public static int[][] rotate(int[][]matrix){
        int x = matrix.length-1; 
        int y = 0;
        int [][] newMatrix = new int[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                newMatrix[i][j] = matrix[x][y];
                x--;
            }
            y++;
            x = matrix.length - 1;
        }
        return newMatrix;
    }
    public static void main(String[] args) {
        int[][]matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
        for(int[] i : matrix){
            for(int j : i){
                System.out.print(j +  " ");
            }
            System.out.println("");            
        }
        matrix = rotate(matrix);
        System.out.println("");
        for(int[] i : matrix){
            for(int j : i){
                System.out.print(j +  " ");
            }
            System.out.println("");
        }
        
    }
    
}
