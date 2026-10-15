package expressjava.practice3.homework.test;

public class Main {
    public static void main(String[] args) {
        Company employee1 = new Company(1, "Ivan");
        Company employee2 = new Company(2, "Hanna");

        Company.companyName = "Google";

        System.out.printf("Employee: %s, Company: %s\n", employee1.getEmployeeName(), Company.companyName);
        System.out.printf("Employee: %s, Company: %s\n", employee2.getEmployeeName(), Company.companyName);
        //employee1.employeeID = 2; // compile error

        System.out.printf("Circle area: %f\n", MathConstants.calculateCircleArea(2));
        System.out.printf("Circle circumference: %f", MathConstants.calculateCircumference(3));

        University student1 = new University(1, "Ivan");
        University student2 = new University(2, "Hanna");
        University student3 = new University(3, "Victor");
        University.changeUniversityName("Stanford");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}
