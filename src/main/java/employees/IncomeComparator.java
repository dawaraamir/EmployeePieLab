package employees;

import java.util.Comparator;

public class IncomeComparator implements Comparator<IPayable> {
    @Override
    public int compare(IPayable person1, IPayable person2) {
        if (person1.calculatePay() > person2.calculatePay()) {
            return 1;
        }
        return -1;
    }
}
