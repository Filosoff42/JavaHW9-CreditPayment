public class CreditPaymentService {
    public double calculate(int amount, int months, double percent) {
        double monthlyInterest = percent / 12 / 100;
        double annuityFactor = (monthlyInterest * Math.pow(1+monthlyInterest, months)) / ((Math.pow(1+monthlyInterest, months)-1));
        return (int) (amount * annuityFactor);
    }

}
