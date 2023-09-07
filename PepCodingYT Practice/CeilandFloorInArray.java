import java.util.*;

public class CeilandFloorInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the number to check ceil and floor: ");
        int num=sc.nextInt();

        int start=0;
        int end=size-1;
        int ceil=0,floor=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (num>arr[mid]){
                start=mid+1;
                floor=arr[mid];
            }
            else if (num<arr[mid]){
                end=mid-1;
                ceil=arr[mid];
            }
            else {
                floor=arr[mid];
                ceil=arr[mid];
                break;
            }
        }
        System.out.println("Ceil value is: "+ceil+" and floor value is: "+floor);
        sc.close();
    }
}
