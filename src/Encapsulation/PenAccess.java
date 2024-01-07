package Encapsulation;

public class PenAccess {
    public static void main(String[] args) {
        Pen pen=new Pen();
        pen.setColor("Blue");
        System.out.println("Pen Color= "+pen.getColor());
        pen.setTip(5);
        System.out.println("Pen Tip= "+pen.getTip());
    }
}
