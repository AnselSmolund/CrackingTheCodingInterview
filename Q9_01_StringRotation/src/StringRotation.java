
/*
Ansel Smolund 8/22/18

Given two strings write code to check if s2 is a rotation of s1 using only 
one call to isSubstring

*/
public class StringRotation {
    public static boolean isRotation(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        String s1 = str1 + str1;
        return s1.contains(str2);        
    }
    public static void main(String[] args) {
        String a = "waterbottle";
        String b = "erbottlewat";
        System.out.println(isRotation(a,b));       
    }   
}
