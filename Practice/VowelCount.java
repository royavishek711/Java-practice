import java.util.*;
public class VowelCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine(); int vowel=0; int cons=0;
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowel++;
            }
            else if (s.charAt(i)>='a' && s.charAt(i)<='z'){
                cons++;
            }
        }
        System.out.println("Vowels count - "+vowel);
        System.out.println("Consonant count - "+cons);
    }
}
