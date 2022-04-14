package Task34.JobPosition;

import Task34.Salary.PercentageSalary;

public class MainEmployee extends Employee implements PercentageSalary {
    public MainEmployee(String name, String surname, String patronymic, double idNumber) {
        super(name, surname, patronymic, idNumber);
    }

    @Override
    public double PercentageSalary(double productPrice, double percentage) {
        checkNumber(productPrice,percentage);
        return (double) productPrice * percentage / 100;
    }

    private void checkNumber(double productPrice, double percentage) {
        if (productPrice < 0 || percentage < 0) {
            System.out.println("Error number");
            System.exit(1);
        }
    }
}
