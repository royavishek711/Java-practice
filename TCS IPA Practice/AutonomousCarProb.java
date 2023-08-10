import java.util.*;

public class AutonomousCarProb {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        aa[] arr=new aa[4];
        for (int i=0;i<4;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            String e=sc.nextLine();
            arr[i]=new aa(a,b,c,d,e);
        }
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int x=method1(arr,s1);
        if (x==0) System.out.println("There are no tests passed in this particular environment");
        else System.out.println(x);
        aa [] ans=method2(arr, s2);
        if (ans==null) System.out.println("No Car is available with the specified brand");
        else {
            for (int i=0; i<ans.length; i++){
                int grade=(ans[i].passed*100)/ans[i].tests;
                if (grade >=80) System.out.println(ans[i].brand+"::A1");
                else System.out.println(ans[i].brand+"::B2");
            }
        }
    }
    
    public static int method1 (aa[] arr, String s1){
        int ans=0;
        for (int i=0;i<4;i++){
            if (arr[i].env.equalsIgnoreCase(s1)){
                ans+=arr[i].passed;
            }
        }
        return ans;
    }

    public static aa[] method2(aa[] arr,String s2){
        aa[] arr2=new aa[0];
        for (int i=0;i<4;i++){
            if (arr[i].brand.equalsIgnoreCase(s2)){
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        if (arr2.length>0) return arr2;
        else return null;
    }
}

class aa{
    int id;
    String brand;
    int tests;
    int passed;
    String env;

    public aa(int a,String b,int c,int d,String e){
        id =a;
        brand =b;
        tests=c;
        passed=d;
        env=e;
    }
}
