package abstract_factory;

class EducationLoan extends Loan {
    @Override
    public void getInterestRate(double r){
        rate = r;
    }
}
