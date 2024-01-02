package Abstraction;

public class HDFC implements RBI{
    @Override
    public float homeLoanInterest() {
        return 3.1f;
    }

    @Override
    public float personalLoanInterest() {
        return 3.2f;
    }

    @Override
    public float savingInterest() {
        return 3.3f;
    }

    @Override
    public float checkammountno() {
        return 0;
    }
}
