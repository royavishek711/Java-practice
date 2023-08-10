import java.util.*;
public class TravelAgency {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //taking inputs by creating class array
        TravelAgencies[] ta=new TravelAgencies[4];
        for (int i=0;i<ta.length;i++){
            int regNo=sc.nextInt();
            sc.nextLine();
            String agencyName=sc.nextLine();
            String packageType=sc.nextLine();
            int price=sc.nextInt();
            sc.nextLine();
            boolean flightFacility=sc.nextBoolean();
            sc.nextLine();

            ta[i]=new TravelAgencies(regNo,agencyName, packageType, price, flightFacility);
        }
        int getRegNo=sc.nextInt(); sc.nextLine();
        String getPackageType=sc.nextLine();
        int maxx=findAgencyWithHighestPackagePrice( ta);//cll 1st method
        System.out.println(maxx);
        TravelAgencies TA= agencyDetailsForGivenIdAndType( ta,  getRegNo, getPackageType);
        if (TA==null){
            System.out.println("no values");
        }
        else {
            System.out.println(TA.getAgencyName() + ":" +TA.getPrice());
        }
        sc.close();
    }
    //1st method
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] ta){
        int max=ta[0].getPrice();
        for (int i=1;i<ta.length;i++){
            if (ta[i].getPrice()>max){
                max=ta[i].getPrice();
            }
        }
        return max;
    }
    //2nd method
    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] ta, int getRegNo,String getPackageType){
        for (int i=0;i<ta.length;i++){
            if (ta[i].getFlightFacility()==true){
                if (ta[i].getRegNo()==getRegNo && ta[i].getPackageType().equals(getPackageType)){
                    return ta[i];
                }
            }
        }
        return null;
    }
}
//creating class
class TravelAgencies{
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;
    //constructor
    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility){
        this.regNo=regNo;
        this.agencyName=agencyName;
        this.packageType=packageType;
        this.price=price;
        this.flightFacility=flightFacility;
    }
    //getters and setters
    int getRegNo() { return regNo; }
    String getAgencyName(){ return agencyName; }
    String getPackageType(){ return packageType; }
    int getPrice(){ return price; }
    boolean getFlightFacility(){ return flightFacility; }
}
