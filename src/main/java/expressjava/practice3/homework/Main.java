package expressjava.practice3.homework;

public class Main {
    public static void main(String[] args) {
        Company employee1 = new Company(1, "Ivan");
        Company employee2 = new Company(2, "Anna");
        Company.companyName = "Google";
        Company.printCompanyName();
        //employee2.employeeID = 3; // compilation error
    }
}
