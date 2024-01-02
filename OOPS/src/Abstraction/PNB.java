package Abstraction;

public class PNB implements RBI{
    @Override
    public float homeLoanInterest(){
        return 2.1f;
    }

    @Override
    public float personalLoanInterest(){
        return 2.2f;
    }
    @Override
    public float savingInterest(){
        return 2.3f;
    }

    @Override
    public float checkammountno() {
        return 0;
    }
}
