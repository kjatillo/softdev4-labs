package ex4;

public class TestLoan {
    public static void main(String[] args) {
        Loan l1 = new Loan(10000,10,10);
        Loan l2 = new Loan(15000, 7,15);

        l1.print();
        l2.print();

        System.out.printf("Monthly payment on loan 1 is €%.3f%n", l1.getMonthlyPayments());
        System.out.printf("Monthly payment on loan 2 is €%.3f%n", l2.getMonthlyPayments());

        System.out.printf("Total payments on loan 1 is €%,.3f%n", (l1.getMonthlyPayments()*l1.getNumberOfPayments()));
        System.out.printf("Total payments on loan 2 is €%,.3f%n", (l2.getMonthlyPayments()*l2.getNumberOfPayments()));

    }
}
