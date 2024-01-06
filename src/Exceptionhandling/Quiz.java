package Exceptionhandling;

public class Quiz {

        public int calculate() {
            try {
                return 2 / 0;
            } catch (ArithmeticException e) {
                return 1;
            }
            finally {
                return 0;
            }
        }
    public static void main(String[] args) {
            Quiz quiz=new Quiz();
        System.out.println("ans = "+quiz.calculate());
    }
}
