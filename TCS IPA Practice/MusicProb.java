import java.util.*;
public class MusicProb {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        music[] arr=new music[4];
        for (int i=0; i<arr.length; i++) {
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            int c= sc.nextInt();sc.nextLine();
            double d=sc.nextDouble(); sc.nextLine();
            arr[i]=new music(a,b,c,d);
        }
        int x=sc.nextInt();sc.nextLine();
        int y=sc.nextInt();sc.nextLine();
        int ans=findAvgOfCount(arr,x);
        if (ans==0) System.out.println("No playlist found.");
        else System.out.println(ans);
        music [] ans2=sortTypeByDuration(arr,y);
        if (ans2==null) System.out.println("No playlist found with mentioned attribute.");
        else {
            for (int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].type);
            }
        }
    }

    public static int findAvgOfCount(music [] arr,int x){
        int sum=0,ans=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i].count>x){
                sum+=arr[i].count;
                ans++;
            }
        }
        if (sum==0) return 0;
        else return sum/ans;
    }

    public static music[] sortTypeByDuration(music [] arr,int y){
        music [] arr2=new music[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i].dur>y){
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2.length-i-1;j++){
                if (arr2[j].dur>arr2[j+1].dur){
                    music temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                }
            }
        }
        if (arr2.length>0) return arr2;
        else return null;
    }
}

class music{
    int no;
    String type;
    int count;
    double dur;

    public music(int a,String b, int c, double d){
        no=a;
        type=b;
        count=c;
        dur=d;
    }
}