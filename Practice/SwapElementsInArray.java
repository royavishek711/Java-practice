import java.util.*;
public class SwapElementsInArray {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
        // swap(arr,x,y);
        // System.out.println(Arrays.toString(arr));
        for (int num:arr){
            System.out.print(num+" ");
        }
        sc.close();
    }
    static void swap(int [] arr, int a, int b){
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
}
