
import java.util.ArrayList;
import java.util.Objects;

//Implement an algorithm to determine if a string has all unique characters
public class isUnique {

    public static boolean isUniqueChars(String str){
        int len = str.length();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < len; i++){
            if(!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
            }else{
                return false;
            }
        }
        return true;
    }
    public static boolean isUniqueChars2(String str){
        int len = str.length();
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(i != j && charEqual(str.charAt(i),str.charAt(j))){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean charEqual(Character a, Character b){
        return a.equals(b);
    }
    public static boolean isUniqueChars3(String str){
        int checker = 0;
        int len = str.length();
        for(int i = 0; i < len; i++){
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val)) > 0){
                return false;
            }
            checker |= (1 << val);        
        }
        return true;
    }
    public static void main(String[] args) {
        String[] tests = {"ansel","smoolund","nott","col","fruit"}; 
        for(String word : tests){
            System.out.print(isUniqueChars(word) + " ");
            System.out.print(isUniqueChars2(word) + " ");
            System.out.print(isUniqueChars3(word) + "|");
        }
        System.out.println('s' - 'a');
    }
    
}
