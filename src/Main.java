public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Сумма: 1000000." + " Cрок кредита: 1 год." + " Процентная ставка 9,99%");
        System.out.println("Ежемесячный платёж: ");
        System.out.println(service.calculate(1_000_000, 12));

        System.out.println();
        System.out.println("Сумма: 1000000." + " Cрок кредита: 2 года." + " Процентная ставка 9,99%");
        System.out.println("Ежемесячный платёж: ");
        System.out.println(service.calculate(1_000_000, 24));

        System.out.println();
        System.out.println("Сумма: 1000000." + " Cрок кредита: 3 года." + " Процентная ставка 9,99%");
        System.out.println("Ежемесячный платёж: ");
        System.out.println(service.calculate(1_000_000, 36));
    }
}
