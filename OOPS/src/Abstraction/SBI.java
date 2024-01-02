package Abstraction;

public class SBI implements RBI{


    @Override
    public float homeLoanInterest() {
        return 1.1f;
    }

    @Override
    public float personalLoanInterest() {
        return 1.2f;
    }

    @Override
    public float savingInterest() {
        return 1.3f;
    }

    @Override
    public float checkammountno() {
        return 0;
    }
}
