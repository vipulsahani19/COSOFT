import java.util.Scanner;
public class Task_02 {
    static double Average(int totalMark,int num_subject){
        double average =totalMark/num_subject;
        return average;
    }
    static int Input_marks(int num_subject){
        Scanner sc=new Scanner(System.in);
        int n=num_subject;
        int [] mark=new int[n];
        int totalMark=0;
        System.out.println("Maximum Mark is 100 & Minimum mark is 0");
        for(int i=0;i<n;i++){
            System.out.print("Enter mark of subject "+(i+1)+" : ");
            mark[i]=sc.nextInt();
            while (mark[i]<0 || mark[i]>100 ){
                System.out.print("Please enter vaild number: ");
                mark[i]= sc.nextInt();
            }totalMark+=mark[i];
        }

        return totalMark;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int number_of_student=sc.nextInt();
        for(int i=1;i<=number_of_student;i++){
            System.out.println("        Enter marks of student "+i);
            System.out.print("Enter total number of Subject: ");
            int num_subject=sc.nextInt();
            int totalmark=Input_marks(num_subject);// Calling the function for Input
            double Average=Average(totalmark,num_subject);
            char Grade;
            if (Average >= 90) {
                Grade = 'A';
            } else if (Average >= 80) {
                Grade = 'B';
            } else if (Average >= 60) {
                Grade = 'C';
            } else if (Average >= 40) {
                Grade = 'D';
            } else {
                Grade = 'F';
            }
            System.out.println("Note --> Minimun passing percentage is 40\n");
            System.out.println("--- RESULT ---");
            System.out.println("Total mark: "+totalmark);
            System.out.println("Average Percentage: "+Average);
            System.out.println("Grade: "+Grade);
        }
    }
}
