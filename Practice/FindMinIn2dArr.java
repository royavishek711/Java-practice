import java.util.*;
public class FindMinIn2dArr {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        int [][] arr={{12,24,36},
    {40,58,61},
    {71,80}};
    System.out.println(min(arr));
    System.out.println(max(arr));
    }
    static int max(int [] [] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]>max) max =arr[i][j];
            }
        }
        return max;
    }
    static int min(int [] [] arr){
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]<min) min =arr[i][j];
            }
        }
        return min;
    }
}
