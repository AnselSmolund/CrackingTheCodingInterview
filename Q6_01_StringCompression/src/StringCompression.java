/*
Ansel Smolund 8/22/18

Implement a method to perform basic string compression using the 
counts of repeated chatacters 

ex. aaaabbbcccaa -> a4b3c3a2

*/
public class StringCompression {
    public static String compress(String str){
        int count = 1;
        char cur = str.charAt(0);
        StringBuilder newString = new StringBuilder();
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i)!=cur){
                newString.append(cur).append(String.valueOf(count));
                count = 1;             
                cur = str.charAt(i);
            }else{
                count++;
            }
        }
        newString.append(cur).append(String.valueOf(count));
        if(newString.length() < str.length()){
            return newString.toString();
        }else{
            return str;
        }
    }
    public static void main(String[] args) {
        String test = "aabcccc";
        System.out.println(test);
        String compressed = compress(test);
        System.out.println(compressed);
    }
    
}
