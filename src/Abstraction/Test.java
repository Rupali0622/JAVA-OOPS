package Abstraction;

public class Test {
    public static void main(String[] args) {

        Test test = new Test();
        RBI rbi = test.getBank("HDFC");

        System.out.println("Homeloan= " + rbi.homeLoanInterest());
        System.out.println("Personalloan= " + rbi.personalLoanInterest());
        System.out.println("Savinginterest= " + rbi.savingInterest());

    }
    public RBI getBank (String bank){
        if (bank.equalsIgnoreCase("SBI")) {
            return new SBI();
        } else if (bank.equalsIgnoreCase("PNB")) {
            return new PNB();
        } else if (bank.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        } else {
            return null;
        }
    }
}
