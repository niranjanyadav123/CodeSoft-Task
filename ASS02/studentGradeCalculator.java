import java.io.*;

class gradeCalculate{
       int sumOfMarks;
       int totalSubjects;
       float avgPer;
       char grade;
        
       void acceptMarks(int n) throws Exception{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            totalSubjects = n;
            String subjectName[] = new String[n];
            int marks[] = new int[n];

            for(int i=0;i<n;i++){
               boolean flag = true;
               while (flag) {

                    try{
                        System.out.print("Enter subject name :: ");
                        subjectName[i] = bufferedReader.readLine();
                        System.out.print("Enter marks (out of 100) :: ");
                        marks[i] = Integer.parseInt(bufferedReader.readLine());
                        sumOfMarks+=marks[i];
                        System.out.println();
                        flag = false;
                    }
                    catch(Exception e){
                        System.out.println("Invalid input !!");
                    }

               }

            }
        }

        float calculateAvgPer(){
              avgPer = (float)sumOfMarks/totalSubjects;
             return avgPer;
        }

        void findGrade(){
             if(avgPer >= 90 && avgPer <= 100 ) grade='A';
             else if(avgPer >= 80 && avgPer < 90) grade='B';
             else if(avgPer >= 70 && avgPer < 80) grade='C';
             else if(avgPer >= 60 && avgPer < 70) grade='D';
             else if(avgPer >= 50 && avgPer < 60) grade='E';
             else grade='F';
        }

        void displayInfo(){
             System.out.println("Total marks :: " + sumOfMarks + "/" + (totalSubjects*100));
             System.out.println("Average Percentage :: " + avgPer);
             System.out.println("Grade :: "+ grade);
             System.out.println();
        }

}

public class Task2 {
     public static void main(String[] args) throws Exception{
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          gradeCalculate objGradeCalculate = new gradeCalculate();

          System.out.println("\n-----Student Grade Calculator--------\n");

          boolean flag1 = true;
          while (flag1) {
               try {
                    System.out.print("How many subjects:: ");
                    int n = Integer.parseInt(bufferedReader.readLine());
                    flag1 = false;

                    //accept subject marks
                   objGradeCalculate.acceptMarks(n);

                    //calculate avg per
                    objGradeCalculate.calculateAvgPer();

                    //assign grade according to percentage
                    objGradeCalculate.findGrade();

                    //display result
                    System.out.println("------Result------\n");
                    objGradeCalculate.displayInfo();

               }
               catch (Exception e) {
                    System.out.println("Invalid Input !!");
               }
          }

     }
}
