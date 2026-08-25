package Task_7;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the monthly salary: ");
            String imMonthlySalary = scanner.next();
            double monthlySalary = Double.parseDouble(imMonthlySalary);
            System.out.print("Enter the hours: ");
            String imHours = scanner.next();
            double hours = Double.parseDouble(imHours);
            System.out.print("Enter the hourly rate: ");
            String imHourlyRate = scanner.next();
            double hourlyRate = Double.parseDouble(imHourlyRate);

            Employee fullTimeEmployee = new FullTimeEmployee(monthlySalary);
            Employee partTimeEmployee = new PartTimeEmployee(hours,hourlyRate);

            System.out.println(fullTimeEmployee.calculateSalary());
            System.out.println(partTimeEmployee.calculateSalary());
        }catch (NumberFormatException e){
            System.out.println("Xəta");
        }

    }
}
