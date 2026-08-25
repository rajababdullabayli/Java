package Task_7;

public class FullTimeEmployee implements Employee{
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        double salary = monthlySalary;
        return salary;
    }
}
