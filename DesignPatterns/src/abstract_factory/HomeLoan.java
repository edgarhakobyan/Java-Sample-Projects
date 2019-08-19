package abstract_factory;

class HomeLoan extends Loan {
    @Override
    public void getInterestRate(double r){
        rate = r;
    }
}
