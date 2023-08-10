import java.util.*;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(); //row
        int b=sc.nextInt(); //column 
        int [][] arr1=new int[a][b]; //int [][] arr=new int[a][]; //you can also skip the column size
        // for (int i=0;i<a;i++) {
        //     for (int j=0;j<b;j++) {
        //         arr1[i][j]=sc.nextInt();
        //     }
        // }
        // for (int i=0;i<a;i++) {
        //     for (int j=0;j<b;j++) {
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        // for (int i=0;i<arr1.length;i++){
        //     System.out.println(Arrays.toString(arr1[i]));
        // }
        for (int[] ar:arr1){
            System.out.println(Arrays.toString(ar));
        }
    }
}
