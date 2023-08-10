import java.util.*;
public class footwearProgrammm {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Footwear [] arr=new Footwear[5];
        for (int i=0;i<5;i++){
            int footwearId=sc.nextInt(); sc.nextLine();
            String footwearName=sc.nextLine();
            String footwearType=sc.nextLine();
            int price=sc.nextInt(); sc.nextLine();

            arr[i]=new Footwear(footwearId,footwearName,footwearType,price);

        }
        String infootwearType=sc.nextLine();
        String infootwearName=sc.nextLine();
        System.out.println();
        int counting=getCountByType(arr,infootwearType);
        if (counting==0) System.out.println("Footwear not available");
        else System.out.println(counting);

        Footwear obj=getSecondHighestPriceByBrand(arr,infootwearName);
        if (obj==null) {
            System.out.println("Brand not available");
        }
        else {
            System.out.println(obj.footwearId);            
            System.out.println(obj.footwearName);            
            System.out.println(obj.price);            
        }
    }
    //1st method
    public static int getCountByType(Footwear[] arr,String infootwearType) {
        int count=0;
        for (int i=0;i<5;i++){
            if (arr[i].footwearType.equalsIgnoreCase(infootwearType)) count++;
        }
        return count;
    }
    //2nd method
    public static Footwear getSecondHighestPriceByBrand(Footwear [] arr,String infootwearName){
        int[] arr2=new int[0];
        for (int i=0;i<5;i++){
            if (arr[i].footwearName.equalsIgnoreCase(infootwearName)){
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i].price;
            }
        }
        Arrays.sort(arr2);
        if (arr2.length>0){
            int x=arr2[arr2.length-2];
            for (int i=0;i<5;i++){
                if (arr[i].price==x){
                    return arr[i];
                }
            }
        }
        return null;
    }
}
class Footwear{
    int footwearId;
    String footwearName;
    String footwearType;
    int price;
    //constructor
    public Footwear(int footwearId,String footwearName,String footwearType,int price){
        this.footwearId=footwearId;
        this.footwearName=footwearName;
        this.footwearType=footwearType;
        this.price=price;
    }
    //getters
    int getFootwearId(){
        return footwearId;
    }
    String getFootwearName(){
        return footwearName;
    }
    String getFootwearType(){
        return footwearType;
    }
    int getPrice(){
        return price;
    }

}
