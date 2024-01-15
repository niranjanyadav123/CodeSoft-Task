import java.io.*;

class InnerTask1 {
     int gen1;
     int correctCount;
     int highCount;
     int lowCount;

     void generatedNumber(int inputNumber){
        gen1 = (int)(Math.random()*100+1);

         if(inputNumber == gen1){
             System.out.println("Correct !!");
             correctCount++;
        }
         else if(inputNumber > gen1){
              System.out.println("High !!");
              highCount++;
         } 
         else {
            System.out.println("Low !!");
            lowCount++;
         }    

     }

     void displayResult(){
          System.out.println("Correct\tHigh\tLow");
          System.out.println(correctCount+"\t"+highCount+"\t"+lowCount);
          System.out.println();
     }

}

public class Task1 {
    public static void main(String[] args) throws Exception{
 
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;

    while(flag) {
            InnerTask1 obInnerTask1 = new InnerTask1();
            System.out.println("\n--------Number Game--------\n");
            System.out.println("] Guess the generated number\n");
            System.out.println("] You have only 3 chances\n");
            System.out.println();


            for(int i=1;i<=3;i++){

               try {
                   System.out.print("Guess the number::");
                   int num1 = Integer.parseInt(bufferedReader.readLine());
                   obInnerTask1.generatedNumber(num1);
                } 
                catch (NumberFormatException e) {
                    System.out.println("Invalid Input !!");
                }
            }

            System.out.println("\n-----Score of game-----");
            obInnerTask1.displayResult();

            boolean flag2 = true;
            while (flag2) {
                System.out.print("Do you want to continue[yes/no] :: ");
                String choice = bufferedReader.readLine();
                choice = choice.toLowerCase();

                switch (choice) {
                     case "yes":
                        flag2 = false;
                        flag = true;
                        break;

                     case "no":
                        System.out.println("Byee ");
                        System.exit(0);    
                        break;

                    default:
                    System.out.println("Invalid input !!");
                    flag2=true;
                       break;
                }
            }

    }   

    }
}
