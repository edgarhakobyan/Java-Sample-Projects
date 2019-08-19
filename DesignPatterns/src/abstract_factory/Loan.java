package abstract_factory;

abstract class Loan {
    protected double rate;

    abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanamount, int years) {
        int n = years * 12;
        rate = rate / 1200;
        double EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanamount;

        System.out.println("your monthly EMI is " + EMI + " for the amount" + loanamount + " you have borrowed");
    }
}
