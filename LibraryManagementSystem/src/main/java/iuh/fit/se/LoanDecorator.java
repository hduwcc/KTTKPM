package iuh.fit.se;

public abstract class LoanDecorator implements Loan {
    protected Loan decoratedLoan;
    public LoanDecorator(Loan l) { this.decoratedLoan = l; }
}
