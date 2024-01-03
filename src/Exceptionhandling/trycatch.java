package Exceptionhandling;

public class trycatch {
    public static void main(String[] args) {
        String s=null;
        try {
            System.out.println("String = "+s.length());

        }catch(NullPointerException n1){ //reference of object class Null

            System.out.println(n1.fillInStackTrace());
        }

    }
}
