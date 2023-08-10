import java.util.*;
public class SearchingInteger {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        int [] arr={23, 45, -56 ,21,99, -68};
        System.out.println("Enter the element to search: ");
        int a=sc.nextInt();
        int ans=search(arr,a);
        if (ans==0) System.out.println("Element not found");
        else System.out.println("Element found at index no: "+ans);
    }
    static int search(int[] arr,int a){

        for (int i=0;i<arr.length;i++){
            if (arr[i]==a) {
                return i;
            }
        }
         return 0;
       
        
    }
}
