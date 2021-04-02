package employees;

public class SalariedEmployee extends Employee implements IPayable{
    double salary;
    public SalariedEmployee(String name, String hiredate, double salary) {
        super(name, hiredate);
        this.salary = salary;
    }
    @Override
    public double calculatePay() {
        return salary;
    }
}
