package Task34.JobPosition;

import Task34.Salary.HourlySalary;

public class Employee implements HourlySalary {

    private String name;
    private String surname;
    private String patronymic;
    private double idNumber;

    public Employee(String name, String surname, String patronymic, double idNumber) {
        checkName(name);
        this.name = name;
        checkName(surname);
        this.surname = surname;
        checkName(patronymic);
        this.patronymic = patronymic;
        this.idNumber = idNumber;
    }

    private void checkName(String name){
        if (name.length() == 0) {
            System.out.println("Name error");
            System.exit(1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public double getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(double idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public double HourlySalary(double oneHourPayment, int hours) {
        checkNumber(oneHourPayment,hours);
        return (double) oneHourPayment * hours;
    }
    private void checkNumber(double oneHourPayment, int hours) {
        if (oneHourPayment < 0 || hours < 0) {
            System.out.println("Error number");
            System.exit(1);
        }
    }
}
