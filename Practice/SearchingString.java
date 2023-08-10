import java.util.*;
public class SearchingString {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        int ans=search(s,c);
        if (ans==0) System.out.println("No String found");
        else System.out.println("String found at index no: "+ans);
        
    }
    static int search(String s,char c){
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==c){
                return i;
            }
        }
        return 0;
    }
}
