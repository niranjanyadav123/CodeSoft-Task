import java.io.*;

class BankAccount {
    static long bankBalance;

    BankAccount(long balance){
         bankBalance = balance;
    }

}

class ATM extends BankAccount{

    ATM(long balance){
        super(balance);
    }

    void withDraw(long balance){

        if(balance>bankBalance){
            System.out.println("Amount is greater than bank balance !!");
            return ;
        }

        bankBalance = bankBalance - balance;
        System.out.println("Amount is withdraw successfully !!");
    }

    void deposting(long balance){
        bankBalance = bankBalance + balance;
        System.out.println("Amount is depositing successfully !!");
    }

    void checkBalance(){
        System.out.println("Available Amount : "+ bankBalance);
    }


}

public class Task3 {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ATM objecAtm = new ATM(0);
        boolean flag = true;

        while(flag) {
             System.out.println("--------ATM--------\n");
             System.out.println("1.Withdraw Amount");
             System.out.println("2.Deposite Amount");
             System.out.println("3.Check Balance");
             System.out.println("4.Exit");

            try {
                System.out.print("Enter choice :: ");
                int choice = Integer.parseInt(bufferedReader.readLine()); 
                
                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter amount ::");
                            long balanceWithDraw = Integer.parseInt(bufferedReader.readLine());
                            objecAtm.withDraw(balanceWithDraw);
                            System.out.println();
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input !!");
                            System.out.println();
                            break;
                        }
               
                    case 2:
                        try {
                            System.out.print("Enter amount ::");
                            long balanceDeposite = Integer.parseInt(bufferedReader.readLine());
                            objecAtm.deposting(balanceDeposite);
                            System.out.println();
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input !!");
                            System.out.println();
                            break;
                        }
                
                    case 3:
                        objecAtm.checkBalance();
                        System.out.println();
                        break;
                
                    case 4:
                        System.out.print("Thank You !!");
                        flag = false;
                        break;
        
                    default:
                        System.out.print("Invalid choice !!\n");
                        System.out.println();
                }

            } 
            catch (NumberFormatException e) {
                 System.out.println("Invalid input !!");
                 System.out.println();
            }

            
        }

    }
}
