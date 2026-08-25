package Task_7;

public class PartTimeEmployee implements Employee{
    private double hours;
    private double hourlyRate;

    public PartTimeEmployee(double hours, double hourlyRate) {
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        double salary = hours*hourlyRate;
        return salary;
    }
}
