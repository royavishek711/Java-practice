import java.util.*;
public class SpanOfAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=sc.nextInt();
        int [] arr =new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        //brute force
        // Arrays.sort(arr);
        // System.out.println("Span of the arrays is: "+(arr[size-1]-arr[0]));

        //now using sorting algo 
        //bubble sort
        for(int i=0; i<size-1; i++){
            for (int j=0; j<size-i-1; j++){
                if (arr[j]>arr[j+1]){
                    arr[j+1]=arr[j]+arr[j+1];
                    arr[j]=arr[j+1]-arr[j];
                    arr[j+1]=arr[j+1]-arr[j];
                }
            }
        }
        System.out.println("Span of the arrays is: "+(arr[size-1]-arr[0]));
        sc.close();
    }
}
