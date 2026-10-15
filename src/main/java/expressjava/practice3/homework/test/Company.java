package expressjava.practice3.homework.test;

public class Company {

    static String companyName = "Company";
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void prinCompanyName() {
        System.out.printf("Company name: %s\n", companyName);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
