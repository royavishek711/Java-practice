import java.util.*;
public class countSpacesAndChars {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        int spaces=0; int chars=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                spaces++;
            }
            else{
                chars++;
            }
        }
        System.out.println("Spaces are: "+spaces+" characters are: "+chars);
    }
}
