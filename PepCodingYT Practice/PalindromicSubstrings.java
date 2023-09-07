import java.util.*;
public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                String palin="";
                String rev=s.substring(i, j);
                
                for (int k=rev.length()-1;k>=0;k--){
                    palin+=rev.charAt(k);
                }
                if (palin.equalsIgnoreCase(rev)){
                    System.out.println(palin);
                }
            }
        }
    }
}
