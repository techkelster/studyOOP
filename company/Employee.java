package company;

class Employee {
    private String firstName, lastName;

    public Employee(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    public void printData() {
        System.out.println(firstName + " " + lastName);
    }
}