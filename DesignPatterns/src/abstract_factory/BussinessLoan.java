package abstract_factory;

class BussinessLoan extends Loan {
    @Override
    public void getInterestRate(double r){
        rate = r;
    }
}
