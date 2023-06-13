package company;

class SalesManager extends Manager {
    private double bonus;
    public SalesManager(String fName, String lName, double b) {
        super(fName, lName, 1250.0);
        bonus = b;
    }
    public double getPay() {
        return (super.getPay() + bonus);
    }

    public void printData() {
        super.printData();
        System.out.println("Total pay: $" + getPay());
    }
}

