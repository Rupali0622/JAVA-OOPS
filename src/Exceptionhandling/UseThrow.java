package Exceptionhandling;

import java.util.Scanner;

public class UseThrow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of i= ");
        int i=scanner.nextInt();
        System.out.print("Enter the value of j= ");
        int j=scanner.nextInt();
        int k=i%j;
        try {
            if(k!=0){
                throw new ArithmeticException("i%j not equal to zero");
            }else{
                System.out.println("i%j is equal to zero");
            }
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
