package expressjava.practice3.homework.test;

public class Main {
    public static void main(String[] args) {
        Company employee1 = new Company(1, "Ivan");
        Company employee2 = new Company(2, "Hanna");

        Company.companyName = "Google";

        System.out.printf("Employee: %s, Company: %s\n", employee1.getEmployeeName(), Company.companyName);
        System.out.printf("Employee: %s, Company: %s\n", employee2.getEmployeeName(), Company.companyName);
        //employee1.employeeID = 2; // compile error
    }
}
