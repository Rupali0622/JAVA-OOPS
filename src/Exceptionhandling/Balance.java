package Exceptionhandling;

import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Current Balance= ");
        int cb=scanner.nextInt();
        System.out.print("Enter Withdraw Balance= ");
        int wb=scanner.nextInt();

        try{
            if(cb<wb){
                throw new ArithmeticException("Insufficient Balance");
            }else{
                cb=cb-wb;
                System.out.println("money sent");
                System.out.println("Current Balance = "+cb);
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Current Balance = "+cb);
        }
    }
}
