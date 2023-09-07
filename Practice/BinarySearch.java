import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("enter the array elements");
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter element to search: ");
        int n=sc.nextInt();
        System.out.println(bin(arr,n)==-1?"Element not exists":"Element exists at index "+bin(arr,n));
    }

    public static int bin(int [] arr,int n){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if (n<arr[mid]){
                end=mid-1;
            }
            else if (n>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
        
    }
}
