package abstract_factory;

abstract class AbstractFactory {
    abstract Bank getBank(String bank);
    abstract Loan getLoan(String loan);
}
