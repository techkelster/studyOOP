package company;

class Manager extends Employee {
    private double salary;

    public Manager(String fName, String lName, double sal) {
        super(fName, lName);
        salary = sal;
    }

    public double getPay() {
        return salary;
    }
    public void printData() {
        super.printData();
        System.out.println("Monthly salary: $" + getPay());
    }
}