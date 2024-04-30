package baru;

public class Baru {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Alice");
        employees[1] = new Engineer("Bob");
        employees[2] = new Salesperson("Charlie");
        employees[3] = new Accountant("David");
        employees[4] = new Secretary("Emily");
        
        
    }
}