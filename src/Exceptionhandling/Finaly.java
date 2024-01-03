package Exceptionhandling;

public class Finaly {
    public static void main(String[] args) {
        int a=5;
        try{
            System.out.println("Answer ="+a/0);
        }
        catch(ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }
        finally {
            System.out.println("Program successfully running");
        }
    }
}
