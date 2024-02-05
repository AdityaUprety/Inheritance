package Model;

public class employee extends Member {
    String Department;

    public employee(String name, int age, int contact, String address, double salaryPerDay, String department) {
        super(name, age, contact, address, salaryPerDay);
        Department = department;
    }
    @Override
    public double getSalary(int notWorkingDays) {
        int workingDays = 24 - notWorkingDays;
        return salaryPerDay * workingDays;
    }
}