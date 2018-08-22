
public class StringRotation {
    public static boolean isRotation(String str1, String str2){
        String s1 = str1 + str1;
        return s1.contains(str2);
        
    }
    public static void main(String[] args) {
        String a = "waterbottle";
        String b = "erbottleewat";
        System.out.println(isRotation(a,b));
        
    }
    
}
