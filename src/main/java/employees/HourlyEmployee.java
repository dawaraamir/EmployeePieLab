package employees;

public class HourlyEmployee extends Employee implements IPayable {
double hourlyRate;
double hoursWorked;

    public HourlyEmployee(String name, String hiredate, double hourlyRate, double hoursWorked) {
    super(name, hiredate);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePay() {
        double pay = hourlyRate * hoursWorked;
    return pay;
    }
}
