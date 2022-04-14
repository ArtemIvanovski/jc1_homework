package Task34.JobPosition;

import Task34.Salary.MixedSalary;

public class Owner extends Employee implements MixedSalary {

    public Owner(String name, String surname, String patronymic, double idNumber) {
        super(name, surname, patronymic, idNumber);
    }

    @Override
    public double MixedSalary(double traffic, double priceProduct, double percentage) {
        checkNumber(traffic, priceProduct, percentage);
        return (double)(traffic+priceProduct * percentage / 100);
    }
    private void checkNumber(double traffic, double priceProduct, double percentage) {
        if (traffic < 0 || priceProduct < 0 || percentage < 0) {
            System.out.println("Error number");
            System.exit(1);
        }
    }
}
