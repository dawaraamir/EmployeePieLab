package employees;

import java.util.ArrayList;

public class CheckCashingPlace {
    public static void main(String[] args) {
        SalariedEmployee salaryEmployee = new SalariedEmployee("James", "2/30/2020", 1000.0 );
        HourlyEmployee hourEmployee = new HourlyEmployee("Mike", "3/19/1999", 200.0, 2.0);
        Entrepreneur entrepreneur1 = new Entrepreneur("Bob", 1000000.0);

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(salaryEmployee);
        employeeArrayList.add(hourEmployee);

        IPayable[] payablePeople = {salaryEmployee, hourEmployee, entrepreneur1};
        ArrayList<IPayable> payableArrayList = new ArrayList<>();
        payableArrayList.add(hourEmployee);
        payableArrayList.add(salaryEmployee);
        payableArrayList.add(entrepreneur1);

        HumanResources humanResources = new HumanResources();
        humanResources.issueBadge(employeeArrayList);
        System.out.println("Prior to sorting...");
        humanResources.payPerson(payablePeople);
        System.out.println();
        System.out.println("After sorting by pay...");
        humanResources.sortPeopleByIncome(payableArrayList);

    }
}
