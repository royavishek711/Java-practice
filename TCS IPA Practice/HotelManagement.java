import java.util.*;
public class HotelManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        hotel [] arr=new hotel[4];
        for (int i=0;i<4;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            int e=sc.nextInt();sc.nextLine();
            arr[i]=new hotel(a,b,c,d,e);
        }
        String s1=sc.nextLine();
        int ans=hotelByHighestRating(arr,s1);
        if (ans==5) System.out.println("NO HOTEL WITH GIVEN FACILITY");
        else System.out.println(ans);
    }

    static int hotelByHighestRating(hotel[] arr,String s1){
        int x=5;
        for (int i=0;i<arr.length;i++){
            if (arr[i].facility.equalsIgnoreCase(s1)){
                if (arr[i].rating>x){
                    x=arr[i].rating;
                }
            }
        }
        return x;
    }
}

class hotel{
    int id;String name;String facility;int rating;int fees;

    public hotel(int a,String b,String c,int d,int e){
        id =a;
        name=b;
        facility=c;
        rating =d;
        fees=e;
    }
}
