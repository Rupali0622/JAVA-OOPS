package Constructor;

public class School {

    String name;
    int rollno;

    School(String name){
        this.name=name;
        System.out.println("Non-Parametrized Constructor");
    }

    School(int rollno){
        this("Rupali");
        this.rollno=rollno;
        System.out.println("Parametrized constructor");
    }
    public static void main(String[] args) {
        School school=new School(101);
        System.out.println("name= "+school.name+"\nRollno= "+school.rollno);

    }






}
