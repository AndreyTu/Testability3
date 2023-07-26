public class CreditPaymentService {
    public double calculate(double cred, double time) {
        double percent = 9.99 / 100 / 12;
        double payment = cred * (percent / (1 - Math.pow((1 + percent), -time)));
        return (int) payment;
    }
}
