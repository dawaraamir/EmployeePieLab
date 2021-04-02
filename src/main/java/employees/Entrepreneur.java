package employees;

public class Entrepreneur extends Person  implements IPayable{
double earnings;
    public Entrepreneur(String name, double earnings) {
        super(name);
        this.earnings = earnings;
    }

    public double calculatePay() {
        double income;
        income = earnings;
        return income;
    }
}
