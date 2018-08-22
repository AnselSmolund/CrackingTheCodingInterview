/*
Ansel Smolund 8/22/18

Write a method to replace all spaces in a string with '%20'
*/
package q3_01_urlify;

import java.util.Arrays;

public class Q3_01_URLify {
    public static int countSpaces(char [] arr, int len){
        int count = 0;
        for(int i = 0; i < len; i++){
            if(arr[i] == ' '){
                count++;
            }
        }
        return count;
    }
    public static String URLify(String str, int len){
        char [] arr = str.toCharArray();
        int index = len + countSpaces(arr,len) * 2;
        for(int i = len - 1; i >= 0; i--){
            if(arr[i] == ' '){
                arr[index - 1] = '0';
                arr[index - 2] = '2';
                arr[index - 3] = '%';
                index-=3; 
            }else{
                arr[index-1] = arr[i];
                index--;
            }
        }
        return new String(arr);
        
    }
    public static void main(String[] args) {
        String test = "Mr Ansel Smolund    ";
        String boom = URLify(test,16);  
        System.out.println(boom);
        
    }
    
}
