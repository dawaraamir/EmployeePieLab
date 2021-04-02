package employees;

import java.util.ArrayList;
import java.util.Collections;

public class HumanResources {


public void issueBadge(ArrayList<Employee>  employeeList) {

    for (Employee currentEmployees : employeeList) {
        System.out.println(currentEmployees.printBadge());
        }
    }
    private void printPaymentInfo(IPayable person) {
        System.out.println(person.getClass().getSimpleName() + "Should be paid: " + person.calculatePay());
    }
    public void sortPeopleByIncome(ArrayList<IPayable> payablePeople) {
        Collections.sort(payablePeople , new IncomeComparator());
        for (IPayable payable: payablePeople) {
            printPaymentInfo(payable);
        }

    }
    public void payPerson(IPayable[] payablePeople) {
    for (IPayable person : payablePeople){
        printPaymentInfo(person);
    }
    }
}
