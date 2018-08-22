
package permutation;

public class Permutation {
    
    public static String insertionSort(String str){
       StringBuilder sorted = new StringBuilder(str);
       for(int i = 0; i < str.length(); i++){
           int j = i; 
           while(j > 0 && sorted.charAt(j-1) > sorted.charAt(j)){
               Character temp = sorted.charAt(j);
               sorted.setCharAt(j, sorted.charAt(j-1));
               sorted.setCharAt(j-1, temp);  
               j--;
           }
       }
       return sorted.toString();
    }
    public static boolean isPermutation(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        String strA = insertionSort(a.toLowerCase());
        String strB = insertionSort(b.toLowerCase());
        return strA.equals(strB);    
    }
   
    public static String sort(String str){
        char [] sorted = str.toCharArray();
        for(int i = 1; i < sorted.length; i++){
            int j = i;
            while (j > 0 && sorted[j-1] > sorted[j]){
                char temp = sorted[j];
                sorted[j] = sorted[j-1];
                sorted[j-1] = temp;
                j--;
            }
        }
        return new String(sorted);
    }
    public static boolean isPermutation2(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        return sort(a).equals(sort(b));
             
    }
    public static boolean isPermutation3(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        int [] letters = new int[128];
        for(int i = 0; i < a.length();i++){
            letters[a.charAt(i)]++;
        }
        for(int i = 0; i < a.length();i++){
            letters[b.charAt(i)]--;
            if(letters[b.charAt(i)] < 0){
             return false;
            }
        
        }
        return true;
             
    }
    public static void main(String[] args) {
 	String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
                String word1 = pair[0];
                String word2 = pair[1];
                boolean anagram = isPermutation3(word1, word2);
                System.out.println(word1 + ", " + word2 + ": " + anagram);
        }       
    }   
}
