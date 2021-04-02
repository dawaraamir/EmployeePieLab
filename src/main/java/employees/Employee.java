package employees;

public abstract class Employee extends Person {
    String hiredate;

    public Employee(String name, String hiredate) {
        super(name);
        this.hiredate = hiredate;
    }

    public String printBadge() {
        System.out.println("Name: " + name);
        System.out.println("Type of employee: " + this.getClass().getSimpleName());
        System.out.println("HireDate: " + hiredate);
        return "";
    }

}
