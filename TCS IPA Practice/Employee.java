import java.util.*;
public class Employee{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        emp[] arr=new emp[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();sc.nextLine();
            char d=sc.next().charAt(0);sc.nextLine();
            double e=sc.nextDouble();sc.nextLine();
            arr[i]=new emp(a,b,c,d,e);
        }
        int g=sc.nextInt();
        emp[] ans=method1(arr);
        if (ans==null) System.out.println("no");
        else {
            System.out.println(ans[1].id+"#"+ans[1].name);
        }
    
        
    }
    public static emp[] method1(emp[] arr){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].salary>arr[j+1].salary){
                    emp temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
        
    }
}
class emp{
    int id;
    String name;
    int age;
    char gender;
    double salary;

    public emp(int a,String b,int c,char d,double e){
        id=a;
        name=b;
        age=c;
        gender=d;
        salary=e;
    }
}