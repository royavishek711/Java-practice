import java.util.*;

public class FirstandLastIndexOfAnDataInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the number to check 1st and last index: ");
        int num=sc.nextInt();

        int start=0;
        int end=size-1;
        int possiblelastindex=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (num>arr[mid]){
                start=mid+1;
                
            }
            else if (num<arr[mid]){
                end=mid-1;
                
            }
            else {
                possiblelastindex=mid;
                start=mid+1;
            }
        }
        start=0;
        end=size-1;
        int possiblefirstindex=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (num>arr[mid]){
                start=mid+1;
                
            }
            else if (num<arr[mid]){
                end=mid-1;
                
            }
            else {
                possiblefirstindex=mid;
                end=mid-1;
            }
        }
        System.out.println("first index is " + possiblefirstindex+" and last index is " +possiblelastindex);
        sc.close();
    }
}
