package company;

class Engineer extends Employee {
    private double wage;
    private double hoursWorked;
    public Engineer(String fName, String lName, double rate, double hours) {
        super(fName, lName);
        wage = rate;
        hoursWorked = hours;
    }

    public double getPay() {
        return wage * hoursWorked;
    }

    public void printData() {
        super.printData();
        System.out.println("Weekly pay: $" + getPay());
    }
}