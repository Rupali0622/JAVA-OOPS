package Exceptionhandling;

public class CheckAge {
    public static void main(String[] args) {
        int age=16;
        try{
            if(age<18){
                throw new ArithmeticException("You are not eligible");
            }else{
                System.out.println("you are eligible");
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
    }
