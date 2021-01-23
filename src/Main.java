public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double percent = 9.99;

        int year1 = 1;
        int monthlyPayment1 = (int) service.calculate(amount, year1 * 12, percent);
        System.out.printf("Сумма кредита: %,d", amount);
        System.out.println(" рублей");
        System.out.printf("Срок кредита: %,d", year1);
        System.out.println(" год");
        System.out.printf("Процентная ставка: %.2f", percent);
        System.out.println(" %");
        System.out.printf("Ежемесячный платёж: %,d", monthlyPayment1);
        System.out.println(" рублей");
        System.out.println();
        int year2 = 2;
        int monthlyPayment2 = (int) service.calculate(amount, year2 * 12, percent);
        System.out.printf("Сумма кредита: %,d", amount);
        System.out.println(" рублей");
        System.out.printf("Срок кредита: %,d", year2);
        System.out.println(" года");
        System.out.printf("Процентная ставка: %.2f", percent);
        System.out.println(" %");
        System.out.printf("Ежемесячный платёж: %,d", monthlyPayment2);
        System.out.println(" рублей");
        System.out.println();
        int year3 = 3;
        int monthlyPayment3 = (int) service.calculate(amount, year3 * 12, percent);
        System.out.printf("Сумма кредита: %,d", amount);
        System.out.println(" рублей");
        System.out.printf("Срок кредита: %,d", year3);
        System.out.println(" года");
        System.out.printf("Процентная ставка: %.2f", percent);
        System.out.println(" %");
        System.out.printf("Ежемесячный платёж: %,d", monthlyPayment3);
        System.out.println(" рублей");
    }
}
