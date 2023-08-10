import java.util.*;
public class SearchElementIn2dArray {
    // public static boolean search(int [][] arr2d,int c){
    //     int flag=0;
    //     for (int i=0;i<arr2d.length;i++){
    //         for (int j=0;j<arr2d[i].length;j++){
    //             if (arr2d[i][j]==c){
    //                 flag=1;
    //                 break;
    //             }
    //         }
    //     }
    //     if (flag==1) return true;
    //     else return false;
    // }

    public static void search(int [][] arr2d,int c){
        int flag=0;
        for (int i=0;i<arr2d.length;i++){
            for (int j=0;j<arr2d[i].length;j++){
                if (arr2d[i][j]==c){
                    flag=1;
                    break;
                }
            }
        }
        if (flag==1) System.out.println("found");
        else System.out.println("not found");
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        boolean flag=false;
        int [] [] arr2d=new int[a][b];
        for (int i=0;i<arr2d.length;i++){
            for (int j=0;j<arr2d[i].length;j++){
                arr2d[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element to search: ");
        int c=sc.nextInt();
        search(arr2d,c); 
        // for (int i=0;i<arr2d.length;i++){
        //     for (int j=0;j<arr2d[i].length;j++){
        //         if (arr2d[i][j]==c){
        //             flag=true;
        //             break;
        //         }
        //     }
        // }
        // if (flag==true) System.out.println("Found");
        // else System.out.println("not found");
    }
}
