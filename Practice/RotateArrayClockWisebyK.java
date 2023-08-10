/*
Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.
Note : Keep the first of the array unaltered.

Example 1:

5  —Value of N
{10, 20, 30, 40, 50}  —Element of Arr[ ]
2  —–Value of K

Output :
40 50 10 20 30

Example 2:

4  —Value of N
{10, 20, 30, 40}  —Element of Arr[]
1  —–Value of K

Output :
40 10 20 30

*/

import java.util.*;
public class RotateArrayClockWisebyK{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int k=sc.nextInt();
        if (k>n){
            k=k%n;
        }
        
        int [] ans=new int[n];
        for (int i=0;i<k;i++){
            ans [i]=arr[n-k+i];
        }

        int index=0;
        for (int i=k;i<n;i++){
            ans[i]=arr[index];
            index++;
        }
        
        for (int i:ans){
            System.out.print(i+ " ");
        }
    }
}