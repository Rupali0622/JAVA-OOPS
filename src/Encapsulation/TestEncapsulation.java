package Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        One one=new One();
        Two two=new Two();
        one.setName("Rupali");
        System.out.println("Name = "+one.getName());
        two.setRollno(100);
        System.out.println("Roll no= "+two.getRollno());
    }
}
