import java.util.*;
public class SearchIn2Darray {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        int [][] arr={{23, 45, 56},
                        {5, 6 , 7},
                        {1, 2}
                    };
        int a=sc.nextInt();  
        int [] ans=SearchIn2Darr(arr, a);
        if (ans==null) System.out.println("Element not found.");
        else System.out.println("Element found at index no: "+Arrays.toString(ans));        
    }
    static int[] SearchIn2Darr(int [][] arr,int a){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==a) return new int[]{i,j};
            }
        }
        return null;
    }
}
