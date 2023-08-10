import java.util.*;
public class courseProgram {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Course[] arr=new Course[4];
        for (int i=0;i<4;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            int e=sc.nextInt(); sc.nextLine();
            arr[i]=new Course(a,b,c,d,e);

        }
        String s=sc.nextLine();
        int f=sc.nextInt(); sc.nextLine();
        int x=findAvgOfQuizByAdmin(arr,s);
        if (x==0) {
            System.out.println("No Course found");
        }
        else{
            System.out.println(x);
        }
        Course [] ans=sortCourseByHandsOn(arr,f);
        if (ans==null){
            System.out.println("No Course found with mentioned attributes.");
        }
        else {
            for (int i=0;i<ans.length;i++){
            System.out.println(ans[i].courseName);
        }
        }

    }

    public static int findAvgOfQuizByAdmin (Course[] arr,String s){
        int sum=0;
        int temp=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i].courseAdmin.equalsIgnoreCase(s)){
                sum+=arr[i].quiz;
                temp++;
            }
        }
        if (temp>0){
            return sum/temp;
        }
        else return 0;
    }

    public static Course[] sortCourseByHandsOn (Course[] arr,int f){
        Course[] arr3=new Course[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i].handson<f){
                arr3=Arrays.copyOf(arr3,arr3.length+1);
                arr3[arr3.length-1]=arr[i];
            }
        }
        for (int i=0;i<arr3.length-1;i++){
            for (int j=0;j<arr3.length-i-1;j++){
                if (arr3[i].handson>arr3[i+1].handson){
                    Course tmp=arr3[i];
                    arr3[i]=arr3[i+1];
                    arr3[i+1]=tmp;
                }
            }
        }
        if (arr3.length>0) return arr3;
        else return null;
    }
}

class Course{
    int courseId;
    String courseName;
    String courseAdmin;
    int quiz;
    int handson;

    public Course(int courseId,String courseName, String courseAdmin, int quiz, int handson){
        this.courseId=courseId;
        this.courseName=courseName;
        this.courseAdmin=courseAdmin;
        this.quiz=quiz;
        this.handson=handson;
    }

    int getCourseId(){ return courseId;}
    String getCourseName(){ return courseName;}
    String getCourseAdmin(){ return courseAdmin;}
    int getQuiz(){ return quiz;}
    int getHandson(){ return handson;}
}
