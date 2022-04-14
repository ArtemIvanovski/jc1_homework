package Task34;

import Task34.JobPosition.Employee;
import Task34.JobPosition.MainEmployee;
import Task34.JobPosition.Owner;

public class Main {
    public static void main(String[] args) {
        Employee Tixon = new Employee("Tixon","Grek","Viktorovich",05423);
        System.out.println("Tixons salary — "+Tixon.HourlySalary(5.50,20));
        MainEmployee Artem = new MainEmployee("Artem","Calenchic","Viktorovich",42237);
        System.out.println("Artems salary —  "+Artem.PercentageSalary(250.2,25));
        Owner Pasha = new Owner("Pasha","Ivanov","Vladislave",45126584);
        System.out.println("Pasha salary — " + Pasha.MixedSalary(4500,234,45));
    }
}
