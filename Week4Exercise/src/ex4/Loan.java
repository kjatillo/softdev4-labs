package ex4;

public class Loan {
    private final int MONTHSINYEAR = 12;
    private double loanAmout;
    private double monthlyInterestRate;
    private int numberOfpayments;

    public Loan(double amount, double rate, int period){
        loanAmout = amount;
        monthlyInterestRate = rate/100.00/MONTHSINYEAR;
        numberOfpayments = period*MONTHSINYEAR;
    }

    public double getAmount(){
        return loanAmout;
    }
    public int getNumberOfPayments(){
        return numberOfpayments;
    }
    public double getRate(){
        return monthlyInterestRate*100*MONTHSINYEAR;
    }
    public void setRate(double rate){
        monthlyInterestRate =rate/100.00/MONTHSINYEAR;
    }
    public void setAmount(double amount){
        loanAmout = amount;
    }
    public double getMonthlyPayments(){
        return (loanAmout*monthlyInterestRate)/(1-Math.pow(1/(1+monthlyInterestRate),numberOfpayments));
    }

    public void print(){
        System.out.println("Loan Details");
        System.out.println("Amount of loan: €"+loanAmout);
        System.out.printf("Monthly Interest Rate: €%,.3f%n",monthlyInterestRate);
        System.out.println("Number of Payments: "+numberOfpayments);
    }
}
