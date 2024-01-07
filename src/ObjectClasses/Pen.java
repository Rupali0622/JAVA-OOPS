package ObjectClasses;

class Ball{
    String Color;
    int tip;

    public void setColor(String Color){
        this.Color=Color;
        System.out.println("Ball Pen  Color = "+this.Color);
    }
    public void setTip(int tip){
        this.tip=tip;
        System.out.println("Ball Pen Tip = "+this.tip);
    }
}
class Gel extends Ball{
    public void setColor(String Color){
        this.Color=Color;
        System.out.println("Gel Pen Color = "+this.Color);
    }
    public void setTip(int tip){
        this.tip=tip;
        System.out.println("Gel Pen Tip = "+this.tip);
    }
}
public class Pen {
    public static void main(String[] args) {
        Ball ball=new Ball();
        ball.setColor("Red");
        ball.setTip(5);
        Gel gel=new Gel();
        gel.setColor("Blue");
        gel.setTip(3);
    }
}
