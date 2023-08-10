import java.util.*;
public class MaxOfAnArray {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int [] arr=new int[a];
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        maxarr(arr);
        
        // for (int i=0;i<a;i++){
            // int ans=arr[0];
        //     if (arr[i]>ans){
        //         ans=arr[i];
        //     }
        // }
        // System.out.println(ans);
        sc.close();
    }
    static void maxarr(int [] arr){
        int ans =arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}
