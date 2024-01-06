package Exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UseThrows {

    public void read() throws FileNotFoundException{
        FileInputStream fileInputStream=new FileInputStream("d:/abc");
    }

    public void save() throws FileNotFoundException{
        FileOutputStream fileInputStream=new FileOutputStream("d:/abc");
    }
}
