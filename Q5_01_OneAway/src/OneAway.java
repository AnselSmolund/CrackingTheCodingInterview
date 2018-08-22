
public class OneAway {
    public static boolean removeCheck(String str1, String str2){      
        if(str1.length() - str2.length() > 1){
            return false;
        }       
        for(int i = 0; i< str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                String newA = str1.substring(i, str1.length());
                String newB = str2.substring(i, str2.length());                
                return newA.contains(newB);
            }
        }
        return true;
    }
    public static boolean insertCheck(String str1, String str2){
        if(str2.length() - str1.length() > 1){
            return false; 
        }
        for(int i = 0; i < str2.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                String newA = str1.substring(i, str1.length());
                String newB = str2.substring(i, str2.length());              
                return newB.contains(newA);
            }
        }
        return true;
    }
    public static boolean replaceCheck(String str1, String str2){
        if(str1.length() != str2.length()){
            return false; 
        }
        int diffChar = 0;        
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                diffChar++;
            }
            if(diffChar > 1){
                return false;
            }
        }
        return true; 
    }
    public static boolean checkOneAway(String str1, String str2){
        return (insertCheck(str1,str2) 
                || removeCheck(str1,str2) 
                || replaceCheck(str1,str2));
    }
    public static void main(String[] args) {
        String a = "ae";
        String b = "pae";
        
        System.out.println(checkOneAway(a,b));
    }
    
}
