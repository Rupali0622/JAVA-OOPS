package Exceptionhandling;

import java.io.FileNotFoundException;

public class TestThrows {
    public static void main(String[] args) {
        UseThrows useThrows=new UseThrows();
        try{
            useThrows.read();
        }catch(FileNotFoundException f){
            System.out.println(f.getMessage());
        }
        try{
            useThrows.save();
        }catch(FileNotFoundException f){
            System.out.println(f.getMessage());
        }


    }
}
