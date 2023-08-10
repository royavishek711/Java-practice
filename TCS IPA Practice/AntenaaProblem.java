import java.util.*;
public class AntenaaProblem {
    public static void main(String[] arg){
        Scanner sc=new Scanner (System.in);
        Antennaas[] an=new Antennaas[4];
        for (int i=0;i<4;i++){
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble();
            sc.nextLine();
            an[i]=new Antennaas(a,b,c,d);
        }
        String s=sc.nextLine();
        double e=sc.nextDouble(); sc.nextLine();
        System.out.println();
        int x=searchAntennaByName(an, s);
        if (x==0) System.out.println("There is no antenna");
        else System.out.println(x);
        Antennaas [] ant=sortAntennaByVSWR(an,e);
        if (ant==null){
            System.out.println("No antenna found");
        }
        else{
            for (int i=0;i<ant.length;i++){
                System.out.println(ant[i].projectLead);
            }
        }

    }

    public static int searchAntennaByName(Antennaas[] an, String s){
        for (int i=0;i<an.length;i++){
            if (an[i].antennaName.equalsIgnoreCase(s)){
                return an[i].antennaid;
            }
        }
        return 0;
    }

    public static Antennaas[] sortAntennaByVSWR(Antennaas [] an,double e){
        Antennaas [] arr= new Antennaas [0];
        for (int i=0;i<an.length;i++){
            if (an[i].antennaVSWR<e){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=an[i];
            }
        }
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[i].antennaVSWR>arr[i+1].antennaVSWR){
                Antennaas temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        }
        if (arr.length>0){
            return arr;
        }
        else return null;
    }
}
class Antennaas{
    int antennaid;
    String antennaName;
    String projectLead;
    double antennaVSWR;

    public Antennaas(int antennaid,String antennaName,String projectLead,double antennaVSWR){
        this.antennaid=antennaid;
        this.antennaName=antennaName;
        this.projectLead=projectLead;
        this.antennaVSWR=antennaVSWR;
    }

    int getAntennaid(){ return antennaid;}
    String getAntennaName(){ return antennaName;}
    String getProjectLead(){ return projectLead;}
    double getAntennaVSWR(){ return antennaVSWR;}
}