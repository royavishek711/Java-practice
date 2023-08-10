import java.util.*;

public class findMinInArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int [] arr={23, 56, 67, 45,-9, 9};
        System.out.println(min(arr));
    }   
    static int min(int [] arr){
        int p=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<p) p=arr[i];
        }
        return p;
    } 
}
