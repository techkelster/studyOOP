package company;

public class PayRoll {
    public static void main(String[] args) {
        Engineer fred = new Engineer("fred", "smith", 12.0, 8.0);
        Manager ann = new Manager("Ann", "Brown", 1500.0);
        SalesManager mary = new SalesManager("Marry", "Kate", 2000);

        Employee[] employees = {fred, ann, mary};

        for (int i = 0; i < 3; i++){
            employees[i].printData();
        }
    }
}