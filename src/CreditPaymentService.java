public class CreditPaymentService {
    public double calculate(int loanAmount, int loanTerm, double percent) {

        double crm = percent / 100 / 12; //Месячная кредитная ставка

        int dm = loanTerm * 12; //перевод в месяцы

        double elevate = Math.pow(1 + crm, dm); // // Возведение в степень для промежуточного расчёта
        double monthlyPayment = loanAmount * (crm + (crm / (elevate - 1)));

        return monthlyPayment;
    }
}
