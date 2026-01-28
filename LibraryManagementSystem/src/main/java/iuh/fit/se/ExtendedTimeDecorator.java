package iuh.fit.se;

public class ExtendedTimeDecorator extends LoanDecorator {
    public ExtendedTimeDecorator(Loan l) { super(l); }
    @Override public String getDetails() { return decoratedLoan.getDetails() + " + Gia hạn thêm 7 ngày"; }
    @Override public double getCost() { return decoratedLoan.getCost() + 5.0; }
}
