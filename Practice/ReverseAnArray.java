import java.util.*;
public class ReverseAnArray {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int [] arr=new int[a];
        for (int i=0; i<a; i++){
            arr[i]=sc.nextInt();
        }
        for (int i=a-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
            sc.close();
    }
}
