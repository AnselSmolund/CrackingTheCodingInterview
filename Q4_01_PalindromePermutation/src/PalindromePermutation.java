
/*
Ansel Smolund 8/22/18

Given a string, write a function to check if it is a permutation
of a palindrome

*/
import java.util.Arrays;

public class PalindromePermutation {
    public static int[] charCount(String str){
        int[]result = new int[128];
        for(int i = 0; i < str.length(); i++){
            result[str.charAt(i)]++;           
        }
        return result; 
    }
    public static boolean isPalindrome(String str){      
        int [] letters = charCount(str); 
        int oddCount = 0;
        for(int i = 0; i < letters.length; i++){
            if(letters[i] % 2 != 0){
                oddCount++;
            }
            if(oddCount > 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String test = "taco cat";
        test = test.replace(" ", "");
        System.out.println(isPalindrome(test.toLowerCase()));

    }
    
}
