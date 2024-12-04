public class Main {
    public static  void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1000000; // рублей
        int loanTerm = 1; // год
        double percent = 9.99; // процентная ставка
        double monthlyPayment  = service.calculate(loanAmount, loanTerm, percent);


        System.out.println(monthlyPayment);
        System.out.println(service.calculate(loanAmount, 2, percent));
        System.out.println(service.calculate(loanAmount, 3, percent));

    }
}